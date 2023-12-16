package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<foodModel> foodModelList = new ArrayList<>();

        foodModelList.add(new foodModel(1,R.drawable.jalabi,"Jalebi","Here's a basic recipe for making jalebi at home. Jalebi is a delicious Indian sweet that's popular during festivals and celebrations. This recipe will make approximately 12-15 jalebis."));
        foodModelList.add(new foodModel(2,R.drawable.khichdi,"Khichdi","Khichdi is a popular and nutritious Indian dish made from rice and lentils (usually moong dal), cooked together with various spices. It's a comfort food that's easy to prepare and is often served as a wholesome meal, especially when someone is feeling under the weather or needs something simple and easy to digest. Here's a basic recipe for making khichdi:"));
        foodModelList.add(new foodModel(3,R.drawable.poha,"Poha","Poha, also known as flattened rice or beaten rice, is a popular and easy-to-make breakfast or snack in India. It is made from rice that has been parboiled and then flattened into thin flakes. Poha is known for its light and fluffy texture and is often used to make a variety of dishes. Here's a basic recipe for making traditional Indian Poha:"));
        foodModelList.add(new foodModel(4,R.drawable.meduvada,"Meduvada","Medu Vada is a popular South Indian snack made from urad dal (black gram) and various spices. It is known for its crispy exterior and soft, fluffy interior. Medu Vada is a common item in South Indian breakfast and is often served with coconut chutney and sambar. Here's a basic recipe for making Medu Vada:"));
        foodModelList.add(new foodModel(5,R.drawable.samosa,"Samosa","Samosa is a popular savory pastry in Indian cuisine, and it's enjoyed not only in India but also in many other parts of the world. A traditional samosa consists of a crispy, flaky pastry shell filled with a mixture of spiced potatoes and peas, although there are many variations with different fillings. Here's a basic recipe for making potato and pea samosas:"));
        foodModelList.add(new foodModel(6,R.drawable.gulab_jamun,"Gulab Jamun","Gulab Jamun is a popular Indian dessert made from deep-fried dough balls soaked in a fragrant sugar syrup. These sweet and syrupy dumplings are a favorite at festivals, special occasions, and celebrations in India. Here's a traditional recipe for making Gulab Jamun:"));
        foodModelList.add(new foodModel(7,R.drawable.sevusal,"Sev Usal","Sev Usal is a popular street food dish from the western Indian state of Gujarat. It's a spicy and tangy snack made with a base of dried peas curry, topped with various toppings like sev (crispy chickpea flour noodles), chopped onions, tomatoes, and an assortment of chutneys and spices. Here's a basic recipe for making Sev Usal:"));
        foodModelList.add(new foodModel(8,R.drawable.dal_vada,"Dal Vada","Dal Vada, also known as Parippu Vada or Lentil Fritters, is a popular South Indian snack made from ground lentils and spices. These vadas are crispy on the outside and soft on the inside, making them a delightful treat. Here's a basic recipe for making Dal Vada:"));
        foodAdapter foodAdapter = new foodAdapter(foodModelList);
        recyclerView.setAdapter(foodAdapter);
        foodAdapter.notifyDataSetChanged();

    }
}