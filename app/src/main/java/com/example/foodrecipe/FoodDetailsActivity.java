package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetailsActivity extends AppCompatActivity {


    ImageView imageView;
    TextView foodTittle,fooddes;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        Intent intent = getIntent();
        int foodid =intent.getIntExtra("id",0);
        imageView = findViewById(R.id.foodimage2);
        foodTittle = findViewById(R.id.tittle);
        fooddes = findViewById(R.id.description);


        String fd = String.valueOf(foodid);
       switch (fd){
           case  "1":{
               imageView.setImageResource(R.drawable.jalabi);
               foodTittle.setText("Jalebi");
               fooddes.setText("Ingredients:\n" + "\n" + "For the Jalebi Batter:\n" + "\n" + "1 cup all-purpose flour (maida)\n" + "2 tablespoons besan (gram flour)\n" + "1/4 teaspoon baking soda\n" + "1/2 cup yogurt (curd)\n" + "A pinch of orange or yellow food coloring (optional)\n" + "1 teaspoon ghee (clarified butter)\n" + "For the Sugar Syrup:\n" + "\n" + "1 cup sugar\n" + "1/2 cup water\n" + "A few saffron strands (optional)\n" + "1/2 teaspoon cardamom powder\n" + "A few drops of rose water (optional)\n" + "A squeeze of lemon juice\n" + "For Deep Frying:\n" + "\n" + "Ghee or vegetable oil\n" + "Instructions:\n" + "\n" + "For the Sugar Syrup:\n" + "\n" + "In a saucepan, combine sugar and water to make the sugar syrup.\n" + "\n" + "Heat it over medium heat until the sugar dissolves.\n" + "\n" + "Add saffron strands (if using), cardamom powder, rose water (if using), and a squeeze of lemon juice.\n" + "\n" + "Let the syrup simmer for about 5-7 minutes until it reaches a one-string consistency. You can check this by taking a drop of syrup between your thumb and index finger. It should form a single thread when pulled apart.\n" + "\n" + "Once the syrup is ready, keep it warm while you prepare the Jalebi batter.\n" + "For the Jalebi Batter:\n" + "\n" + "\n" + "In a mixing bowl, combine all-purpose flour, besan, baking soda, and food coloring (if using).\n" + "\n" + "Add yogurt and ghee to the dry ingredients and mix well to form a smooth batter. The batter should be thick yet flowing. Adjust with water if needed.\n" + "\n" + "Cover the bowl and let the batter ferment for 4-6 hours or overnight. Fermentation helps in giving the Jalebi its characteristic sourness and texture.\n" + "\n" + "For Deep Frying:\n" + "\n" + "Heat ghee or vegetable oil in a deep frying pan or kadai over medium heat.\n" + "\n" + "Fill the Jalebi batter into a squeeze bottle or a plastic bag with a small hole at one corner.\n" + "\n" + "Squeeze the batter into the hot oil to form spirals or pretzel-like shapes. You can make them as small or large as you prefer.\n" + "\n" + "Fry them until they are crisp and golden brown, turning them as needed. This should take about 2-3 minutes per side.\n" + "\n" + "Assembling:\n" + "\n" + "Immediately transfer the hot Jalebis into the prepared sugar syrup.\n" + "\n" + "Let them soak in the syrup for about 1-2 minutes, ensuring they absorb the syrup.\n" + "\n" + "Serve:\n" + "\n" + "Remove the Jalebis from the syrup and place them on a serving plate.\n" + "\n" + "You can garnish them with chopped pistachios or almonds if desired.\n" + "\n" + "Serve Jalebi warm or at room temperature.\n" + "\n" + "Enjoy your homemade Jalebis! They are best when freshly made and served, and they are a favorite sweet treat in India, especially during festivals and celebrations.");

               break;
           }
           case  "2":{
               imageView.setImageResource(R.drawable.khichdi);
               foodTittle.setText("Khichdi");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "1 cup rice\n" +
                       "1/2 cup split yellow moong dal (lentils)\n" +
                       "2 tablespoons ghee (clarified butter) or cooking oil\n" +
                       "1 teaspoon cumin seeds\n" +
                       "1/2 teaspoon mustard seeds (optional)\n" +
                       "1/2 teaspoon turmeric powder\n" +
                       "1/2 teaspoon asafoetida (hing)\n" +
                       "1 small onion, finely chopped (optional)\n" +
                       "1-2 cloves garlic, minced (optional)\n" +
                       "1-inch piece of ginger, grated or minced\n" +
                       "1-2 green chilies, chopped (adjust to taste)\n" +
                       "2-3 cups water (adjust for desired consistency)\n" +
                       "Salt to taste\n" +
                       "Fresh coriander leaves, chopped, for garnish (optional)\n" +
                       "Instructions:\n" +
                       "\n" +
                       "Wash and Rinse: Wash the rice and lentils together in plenty of water until the water runs clear. Drain and set aside.\n" +
                       "\n" +
                       "Heat Ghee or Oil: In a large heavy-bottomed pot or pressure cooker, heat the ghee or oil over medium heat.\n" +
                       "\n" +
                       "Temper the Spices: Add cumin seeds and mustard seeds (if using). Let them splutter.\n" +
                       "\n" +
                       "Add Aromatics: Add asafoetida, grated ginger, minced garlic, and chopped green chilies. Sauté for a minute or until the raw aroma disappears.\n" +
                       "\n" +
                       "Add Onions (Optional): If using onions, add them now and sauté until they turn translucent.\n" +
                       "\n" +
                       "Add Lentils and Rice: Add the washed lentils and rice to the pot. Stir and sauté for a couple of minutes to coat them with the spices.\n" +
                       "\n" +
                       "Add Turmeric and Salt: Add turmeric powder and salt. Mix well.\n" +
                       "\n" +
                       "Cook: Pour in 2-3 cups of water (adjust based on your desired consistency). Stir well and bring it to a boil. Reduce the heat to low, cover with a lid, and let it simmer. If using a pressure cooker, cover with a lid without the weight and cook on low heat.\n" +
                       "\n" +
                       "Cook Until Done: Cook the khichdi for about 20-25 minutes on low heat, or if using a pressure cooker, for 2-3 whistles. It should be soft and well-cooked.\n" +
                       "\n" +
                       "Serve: Once the khichdi is done, garnish it with fresh coriander leaves if desired. You can serve it hot with yogurt, pickle, or a dollop of ghee.\n" +
                       "\n" +
                       "Khichdi is not only delicious but also highly customizable. You can add vegetables like peas, carrots, or potatoes to make it more nutritious. Adjust the spiciness to your taste by adding more or fewer green chilies. It's a versatile dish that's enjoyed across India and can be adapted to suit your preferences.");

               break;
           }

           case  "3":{
               imageView.setImageResource(R.drawable.poha);
               foodTittle.setText("Poha");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "1 cup thick or medium-sized poha (flattened rice)\n" +
                       "2 tablespoons cooking oil\n" +
                       "1/2 teaspoon mustard seeds\n" +
                       "1/2 teaspoon cumin seeds\n" +
                       "1/2 cup chopped onions\n" +
                       "1-2 green chilies, finely chopped (adjust to taste)\n" +
                       "1/2 cup chopped potatoes (optional)\n" +
                       "1/4 cup roasted peanuts\n" +
                       "1/4 teaspoon turmeric powder\n" +
                       "Salt to taste\n" +
                       "1-2 tablespoons lemon juice\n" +
                       "Fresh coriander leaves, chopped, for garnish (optional)\n" +
                       "Grated coconut for garnish (optional)\n" +
                       "Instructions:\n" +
                       "\n" +
                       "Rinse Poha: Place the poha in a colander or sieve and rinse it under running water for a few seconds. Gently fluff it with your fingers while rinsing. Be careful not to soak it too long, or it will become mushy. Drain well and set aside.\n" +
                       "\n" +
                       "Heat Oil: In a large pan or skillet, heat the cooking oil over medium heat.\n" +
                       "\n" +
                       "Temper Spices: Add mustard seeds and cumin seeds to the hot oil. Allow them to splutter.\n" +
                       "\n" +
                       "Add Onions: Add chopped onions and green chilies (and potatoes if using). Sauté until the onions turn translucent and the potatoes are cooked through. This should take about 5-7 minutes.\n" +
                       "\n" +
                       "Add Peanuts: Add the roasted peanuts and sauté for another 2-3 minutes.\n" +
                       "\n" +
                       "Add Turmeric and Salt: Add turmeric powder and salt. Mix well.\n" +
                       "\n" +
                       "Add Poha: Add the rinsed and drained poha to the pan. Gently toss everything together to combine. Cook for an additional 2-3 minutes, stirring occasionally, until the poha is heated through and well mixed with the spices.\n" +
                       "\n" +
                       "Add Lemon Juice: Drizzle lemon juice over the poha and give it a final stir.\n" +
                       "\n" +
                       "Garnish and Serve: Remove from heat and garnish with chopped coriander leaves and grated coconut (if desired).\n" +
                       "\n" +
                       "Serve: Serve the poha hot as is or with a side of yogurt, chutney, or pickle.\n" +
                       "\n" +
                       "Poha is a versatile dish, and you can customize it to your liking. Some variations include adding peas, tomatoes, or grated carrots. It's a quick and nutritious option for breakfast or a light meal and is enjoyed in different regions of India with regional variations in ingredients and flavors.");


               break;
           }
           case  "4":{
               imageView.setImageResource(R.drawable.meduvada);
               foodTittle.setText("Meduvada");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "1 cup urad dal (black gram)\n" +
                       "1-2 green chilies, finely chopped (adjust to taste)\n" +
                       "1 inch piece of ginger, grated\n" +
                       "A pinch of asafoetida (hing)\n" +
                       "1/2 teaspoon cumin seeds\n" +
                       "A few curry leaves, chopped\n" +
                       "Salt to taste\n" +
                       "Oil for deep frying\n" +
                       "Instructions:\n" +
                       "\n" +
                       "Soak Urad Dal:\n" +
                       "\n" +
                       "Wash the urad dal thoroughly and soak it in enough water for 4-5 hours or overnight. This step is essential to ensure the vadas turn out soft and fluffy.\n" +
                       "Drain and Grind:\n" +
                       "\n" +
                       "Drain the soaked urad dal well.\n" +
                       "Grind the urad dal into a smooth and thick batter using as little water as possible. You may need to add a few tablespoons of water to help with grinding, but avoid making the batter too thin.\n" +
                       "The batter should be airy and light.\n" +
                       "Add Spices:\n" +
                       "\n" +
                       "Transfer the urad dal batter to a mixing bowl.\n" +
                       "Add chopped green chilies, grated ginger, asafoetida, cumin seeds, chopped curry leaves, and salt to the batter.\n" +
                       "Mix everything well.\n" +
                       "Shape the Vadas:\n" +
                       "\n" +
                       "Heat oil for deep frying in a heavy-bottomed pan or kadai over medium-high heat.\n" +
                       "Wet your hands with water to prevent sticking, and take a small portion of the batter.\n" +
                       "Flatten it slightly between your palms to make a small, round disc.\n" +
                       "Create a hole in the center with your thumb to give it the traditional medu vada shape.\n" +
                       "Fry the Vadas:\n" +
                       "\n" +
                       "Carefully slide the shaped vada into the hot oil.\n" +
                       "Fry the vadas in batches, making sure not to overcrowd the pan.\n" +
                       "Fry until they turn golden brown and crispy on both sides, turning them as needed. This usually takes about 3-4 minutes per side.\n" +
                       "Drain and Serve:\n" +
                       "\n" +
                       "Remove the fried vadas using a slotted spoon and drain them on paper towels to remove excess oil.\n" +
                       "Serve Hot:\n" +
                       "\n" +
                       "Serve the medu vadas hot with coconut chutney and sambar.\n" +
                       "Medu Vada is best enjoyed when it's fresh and crispy. It's a delightful snack or breakfast item loved by many, not just in South India but throughout the country.");


               break;
           }
           case  "5":{
               imageView.setImageResource(R.drawable.samosa);
               foodTittle.setText("Samosa");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "For the Pastry Dough:\n" +
                       "\n" +
                       "2 cups all-purpose flour (maida)\n" +
                       "1/4 cup vegetable oil or ghee (clarified butter)\n" +
                       "A pinch of salt\n" +
                       "Water for kneading\n" +
                       "For the Filling:\n" +
                       "\n" +
                       "2 large potatoes, boiled, peeled, and diced into small cubes\n" +
                       "1/2 cup green peas (fresh or frozen)\n" +
                       "2 tablespoons oil\n" +
                       "1 teaspoon cumin seeds\n" +
                       "1 teaspoon ginger-garlic paste\n" +
                       "1-2 green chilies, finely chopped (adjust to taste)\n" +
                       "1/2 teaspoon turmeric powder\n" +
                       "1 teaspoon ground coriander\n" +
                       "1/2 teaspoon ground cumin\n" +
                       "1 teaspoon garam masala\n" +
                       "Salt to taste\n" +
                       "Fresh coriander leaves, chopped, for garnish (optional)\n" +
                       "Oil for deep frying\n" +
                       "Instructions:\n" +
                       "\n" +
                       "For the Pastry Dough:\n" +
                       "\n" +
                       "In a mixing bowl, combine the all-purpose flour, a pinch of salt, and the vegetable oil or ghee.\n" +
                       "\n" +
                       "Gradually add water, little by little, and knead the mixture into a smooth and stiff dough. Cover it with a damp cloth and let it rest for 20-30 minutes.\n" +
                       "\n" +
                       "For the Filling:\n" +
                       "\n" +
                       "Heat 2 tablespoons of oil in a pan over medium heat.\n" +
                       "\n" +
                       "Add cumin seeds and let them splutter.\n" +
                       "\n" +
                       "Add ginger-garlic paste and chopped green chilies. Sauté for a minute or until the raw aroma disappears.\n" +
                       "\n" +
                       "Add turmeric powder, ground coriander, ground cumin, and garam masala. Mix well.\n" +
                       "\n" +
                       "Add the diced potatoes and green peas. Season with salt. Mix everything together and cook for 4-5 minutes, stirring occasionally, until the filling is well-cooked and the spices are well combined. You can also mash the potatoes slightly while mixing.\n" +
                       "\n" +
                       "Remove the filling from the heat and let it cool.\n" +
                       "\n" +
                       "Assembling and Frying Samosas:\n" +
                       "\n" +
                       "Divide the rested dough into equal-sized balls, typically about the size of a golf ball.\n" +
                       "\n" +
                       "Roll each ball into a thin oval or circular shape, about 6-7 inches in diameter.\n" +
                       "\n" +
                       "Cut the rolled dough in half to make two semi-circles.\n" +
                       "\n" +
                       "Take one semi-circle, wet the edges with a little water, and fold it into a cone shape, sealing the edges to form a cone.\n" +
                       "\n" +
                       "Fill the cone with the prepared potato and pea filling.\n" +
                       "\n" +
                       "Seal the open edge by pinching it together to enclose the filling. Ensure the samosa is tightly sealed to prevent oil from seeping in during frying.\n" +
                       "\n" +
                       "Repeat the process with the remaining dough and filling to make more samosas.\n" +
                       "\n" +
                       "Heat oil in a deep frying pan or kadai over medium heat. The oil should be hot but not smoking.\n" +
                       "\n" +
                       "Carefully slide the prepared samosas into the hot oil, a few at a time, without overcrowding the pan.\n" +
                       "\n" +
                       "Fry the samosas until they turn golden brown and crispy, turning them occasionally for even cooking. This usually takes about 6-8 minutes.\n" +
                       "\n" +
                       "Remove the fried samosas with a slotted spoon and drain them on paper towels to remove excess oil.\n" +
                       "\n" +
                       "Serve the hot and crispy samosas with green chutney, tamarind chutney, or ketchup.\n" +
                       "\n" +
                       "Samosas are a delightful snack or appetizer, and they can be enjoyed on their own or as part of a meal. They're a favorite at parties, festivals, and as street food in many parts of India and beyond.");

               break;

           }
           case  "6":{
               imageView.setImageResource(R.drawable.gulab_jamun);
               foodTittle.setText("Gulab Jamun");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "For the Gulab Jamun Dough:\n" +
                       "\n" +
                       "1 cup milk powder\n" +
                       "1/4 cup all-purpose flour (maida)\n" +
                       "1/4 teaspoon baking soda\n" +
                       "2 tablespoons ghee (clarified butter)\n" +
                       "A pinch of cardamom powder\n" +
                       "A few tablespoons of milk (as needed to form a smooth dough)\n" +
                       "For the Sugar Syrup:\n" +
                       "\n" +
                       "1.5 cups sugar\n" +
                       "1.5 cups water\n" +
                       "A few saffron strands (optional)\n" +
                       "1/4 teaspoon cardamom powder\n" +
                       "A few drops of rose essence (optional)\n" +
                       "A squeeze of lemon juice\n" +
                       "For Frying:\n" +
                       "\n" +
                       "Ghee or oil for deep frying\n" +
                       "Instructions:\n" +
                       "\n" +
                       "For the Sugar Syrup:\n" +
                       "\n" +
                       "In a saucepan, combine sugar and water to make the sugar syrup.\n" +
                       "\n" +
                       "Bring the mixture to a boil, then reduce the heat to a simmer. Add saffron strands (if using), cardamom powder, rose essence (if using), and a squeeze of lemon juice.\n" +
                       "\n" +
                       "Simmer the syrup for about 5-7 minutes until it slightly thickens. The syrup should be sticky but not too thick. Keep it warm while you prepare the Gulab Jamun.\n" +
                       "\n" +
                       "For the Gulab Jamun Dough:\n" +
                       "\n" +
                       "In a mixing bowl, combine milk powder, all-purpose flour, baking soda, and cardamom powder.\n" +
                       "\n" +
                       "Add ghee to the dry ingredients and mix well. The mixture should resemble bread crumbs.\n" +
                       "\n" +
                       "Gradually add milk, little by little, and knead the mixture into a smooth, soft dough. The dough should be soft but not sticky. If it's too dry, add a little more milk; if it's too sticky, add a bit more milk powder.\n" +
                       "\n" +
                       "Divide the dough into small, equal-sized portions and roll them into smooth, crack-free balls. Make sure there are no cracks on the surface, as this can cause the Gulab Jamun to break while frying.\n" +
                       "\n" +
                       "For Frying:\n" +
                       "\n" +
                       "Heat ghee or oil in a deep frying pan or kadai over medium-low heat. The temperature should be around 325-350°F (165-175°C).\n" +
                       "\n" +
                       "Gently slide the prepared Gulab Jamun balls into the hot ghee or oil, a few at a time, without overcrowding the pan.\n" +
                       "\n" +
                       "Fry them on low to medium-low heat, turning them occasionally, until they turn golden brown and evenly cooked. This should take about 7-8 minutes.\n" +
                       "\n" +
                       "Remove the fried Gulab Jamun from the oil using a slotted spoon and drain them on paper towels to remove excess oil.\n" +
                       "\n" +
                       "Assembling:\n" +
                       "\n" +
                       "While the fried Gulab Jamun balls are still warm, carefully place them in the warm sugar syrup. Ensure that the sugar syrup covers them completely.\n" +
                       "\n" +
                       "Allow the Gulab Jamun to soak in the sugar syrup for at least 1-2 hours. They will absorb the syrup and become soft, spongy, and sweet.\n" +
                       "\n" +
                       "Serve Gulab Jamun warm or at room temperature. They can be garnished with chopped pistachios or almonds if desired.\n" +
                       "\n" +
                       "Enjoy your homemade Gulab Jamun, a delightful and indulgent Indian dessert!");

                            break;
           }
           case "7":{
               imageView.setImageResource(R.drawable.sevusal);
               foodTittle.setText("Sev Usal");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "For the Usal (Dried Peas Curry):\n" +
                       "\n" +
                       "1 cup dried white peas or safed vatana (soaked overnight)\n" +
                       "1 medium-sized onion, finely chopped\n" +
                       "1 medium-sized tomato, finely chopped\n" +
                       "2-3 cloves garlic, minced\n" +
                       "1-inch piece of ginger, grated\n" +
                       "1 green chili, finely chopped (adjust to taste)\n" +
                       "1/2 teaspoon turmeric powder\n" +
                       "1 teaspoon red chili powder (adjust to taste)\n" +
                       "1 teaspoon garam masala\n" +
                       "1/2 teaspoon cumin seeds\n" +
                       "A pinch of asafoetida (hing)\n" +
                       "Salt to taste\n" +
                       "2 tablespoons oil\n" +
                       "Water for cooking\n" +
                       "For Toppings:\n" +
                       "\n" +
                       "Sev (crispy chickpea flour noodles)\n" +
                       "Chopped onions\n" +
                       "Chopped tomatoes\n" +
                       "Chopped cilantro (coriander leaves)\n" +
                       "Tamarind chutney\n" +
                       "Green chutney\n" +
                       "Lemon wedges\n" +
                       "Farsan (a savory snack mix, optional)\n" +
                       "Instructions:\n" +
                       "\n" +
                       "For the Usal (Dried Peas Curry):\n" +
                       "\n" +
                       "Rinse the soaked dried white peas and drain them.\n" +
                       "\n" +
                       "In a pressure cooker or a large pot, heat oil over medium heat. Add cumin seeds and let them splutter.\n" +
                       "\n" +
                       "Add asafoetida, minced garlic, grated ginger, and chopped green chili. Sauté for a minute until fragrant.\n" +
                       "\n" +
                       "Add finely chopped onions and sauté until they turn translucent.\n" +
                       "\n" +
                       "Add turmeric powder, red chili powder, garam masala, and salt. Mix well.\n" +
                       "\n" +
                       "Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\n" +
                       "\n" +
                       "Add the soaked dried white peas to the pot and mix everything together.\n" +
                       "\n" +
                       "Add enough water to cover the peas. Close the pressure cooker lid (if using) without the weight, and cook on medium-low heat for about 20-25 minutes until the peas are tender and cooked. If using a regular pot, cover and cook until the peas are soft, adding water as needed.\n" +
                       "\n" +
                       "Once the peas are cooked, mash some of them to thicken the curry while leaving some whole for texture.\n" +
                       "\n" +
                       "To Serve Sev Usal:\n" +
                       "\n" +
                       "To serve, place a ladleful of the prepared Usal (dried peas curry) in a serving bowl.\n" +
                       "\n" +
                       "Top it with a generous amount of sev, chopped onions, chopped tomatoes, and chopped cilantro.\n" +
                       "\n" +
                       "Drizzle tamarind chutney and green chutney over the toppings according to your taste.\n" +
                       "\n" +
                       "Optionally, add some farsan (savoury snack mix) on top for extra crunch and flavor.\n" +
                       "\n" +
                       "Serve Sev Usal hot with lemon wedges.\n" +
                       "\n" +
                       "Sev Usal is a delicious and flavorful snack that's bursting with different textures and tastes. It's a must-try if you enjoy Indian street food.");

               break;

           }
           case "8":{
               imageView.setImageResource(R.drawable.dal_vada);
               foodTittle.setText("Dal-Vada");
               fooddes.setText("Ingredients:\n" +
                       "\n" +
                       "1 cup split yellow lentils (chana dal)\n" +
                       "2-3 green chilies, chopped (adjust to taste)\n" +
                       "1 inch piece of ginger, grated\n" +
                       "1 medium-sized onion, finely chopped\n" +
                       "A handful of curry leaves, chopped\n" +
                       "1/4 cup chopped fresh coriander leaves\n" +
                       "1 teaspoon cumin seeds\n" +
                       "1/2 teaspoon black mustard seeds (optional)\n" +
                       "A pinch of asafoetida (hing)\n" +
                       "Salt to taste\n" +
                       "Oil for deep frying\n" +
                       "Instructions:\n" +
                       "\n" +
                       "Prepare the Lentils:\n" +
                       "\n" +
                       "Wash the split yellow lentils (chana dal) thoroughly and soak them in enough water for about 2-3 hours. This soaking process helps soften the lentils.\n" +
                       "Grind the Lentils:\n" +
                       "\n" +
                       "Drain the soaked lentils and place them in a blender or food processor.\n" +
                       "Add the chopped green chilies and grated ginger.\n" +
                       "Grind the mixture into a coarse paste without adding too much water. You want a slightly coarse texture for the vada batter.\n" +
                       "Mix the Ingredients:\n" +
                       "\n" +
                       "Transfer the ground lentil mixture to a mixing bowl.\n" +
                       "Add the chopped onions, chopped curry leaves, chopped coriander leaves, cumin seeds, black mustard seeds (if using), asafoetida, and salt. Mix everything well.\n" +
                       "Shape the Vadas:\n" +
                       "\n" +
                       "Heat oil for deep frying in a deep pan or kadai over medium heat.\n" +
                       "Wet your fingers and take a small portion of the vada mixture.\n" +
                       "Shape it into a flat, round patty with a hole in the center, similar to a donut.\n" +
                       "You can use a greased plastic sheet or your hand to shape the vadas.\n" +
                       "Fry the Vadas:\n" +
                       "\n" +
                       "Carefully slide the shaped vadas into the hot oil, a few at a time, without overcrowding the pan.\n" +
                       "Fry them until they turn golden brown and crispy on both sides, turning them occasionally for even cooking. This usually takes about 4-5 minutes per side.\n" +
                       "Drain and Serve:\n" +
                       "\n" +
                       "Remove the fried vadas with a slotted spoon and drain them on paper towels to remove excess oil.\n" +
                       "Serve Hot:\n" +
                       "\n" +
                       "Serve Dal Vada hot with coconut chutney or tomato chutney.\n" +
                       "Dal Vada is a delightful snack or appetizer, and it's especially popular in South India. It's a great addition to any meal and is loved for its crispy texture and the aromatic flavors of lentils and spices.");
               break;
           }
           default:{

           }
       }
    }
}