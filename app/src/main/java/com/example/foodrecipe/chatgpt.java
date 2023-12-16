package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class chatgpt extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView welcome;
    EditText messText;
    ImageButton sendButton;
    List<message> messageList;


    //okhttp

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();



    messageAdapter messageAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatgpt);
        messageList = new ArrayList<>();



        recyclerView = findViewById(R.id.recyclerView);
        welcome = findViewById(R.id.welcome);
        messText = findViewById(R.id.message);
        sendButton = findViewById(R.id.send);
        //****//
        messageAdapter = new messageAdapter(messageList);
        recyclerView.setAdapter(messageAdapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setStackFromEnd(true);
        recyclerView.setLayoutManager(llm);


        sendButton.setOnClickListener(view -> {
            String question = messText.getText().toString().trim();
            add_to_chat(question,message.sent_by_me);
            messText.setText("");
            callAPI(question);
            welcome.setVisibility(View.GONE);

        });

    }

    void add_to_chat(String message,String sentby){
        runOnUiThread(new Runnable() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void run() {
                messageList.add(new message(message,sentby));
                messageAdapter.notifyDataSetChanged();
                recyclerView.smoothScrollToPosition(messageAdapter.getItemCount());
            }
        });

    }
    void addresponse(String response){
        add_to_chat(response,message.sent_by_bot);
    }


    void callAPI(String question) {


        //okhttp

        JSONObject jsonbody = new JSONObject();
        try {
            jsonbody.put("model", "gpt-3.5-turbo-instruct");
            jsonbody.put("prompt", question);
            jsonbody.put("max_tokens", 4000);
            jsonbody.put("temperature", 0);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        if (question.equalsIgnoreCase("")) {
            addresponse("Failed to load response due to Empty message");
        }
        else if (question.equalsIgnoreCase("who created you") || (question.equalsIgnoreCase("who is your creator")))
        {
            addresponse("I am Glad to tell you that My creator Mr Shailyarajsinh J Mahida");
        }
        else if (question.equalsIgnoreCase("who is shailyarajsinh j mahida"))
        {
            addresponse("Shailyaraj sir is My Creator,and he made this Project for MAD Given By Professor Sonal Jain");
        }
        else if (question.equalsIgnoreCase("who is sonal jain"))
        {
            addresponse("Professor of GDCST");
        }
        else
        {

            RequestBody body = RequestBody.create(jsonbody.toString(), JSON);
            Request request = new Request.Builder()
                    .url("https://api.openai.com/v1/completions")
                    .header("Authorization", "Bearer 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")
                    .post(body)
                    .build();
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    addresponse("Failed to load response due to " + e.getMessage());
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                    if (response.isSuccessful()) {
                        try {
                            JSONObject jsonObject = new JSONObject(response.body().string());
                            JSONArray jsonArray = jsonObject.getJSONArray("choices");
                            String result = jsonArray.getJSONObject(0).getString("text");
                            addresponse(result.trim());
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }


                    } else {
                        addresponse("Failed to load response due To " + response.body().string());

                    }
                    if (question.equalsIgnoreCase("")) {
                        addresponse("Failed to load response due to Empty String");
                    }

                }
            });
        }
    }
}