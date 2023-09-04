package com.example.restaurantjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.restaurantjetpackcompose.list_item.FoodItem
import com.example.restaurantjetpackcompose.model.Food
import com.example.restaurantjetpackcompose.ui.theme.RestaurantJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodList()

        }
    }
}

@Composable
private fun FoodList() {

    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Traditional italian pizza",
            foodDescription = "Tomato sauce, mozzarella cheese and basil leaves.",
            price = "$ 20.00"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Lasagna Bolognese",
            foodDescription = "With layers of tomato sauce, ground meat and cheese",
            price = "$ 18.00"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Red pasta",
            foodDescription = "Tomato sauce, pepperoni, cheese and herbs",
            price = "$ 17.00"
        ),
        Food(
            imgFood = R.drawable.food4,
            foodName = "Pasta with spinach sauce",
            foodDescription = "White sauce with spinach and green herbs",
            price = "$ 23.00"
        ),
        Food(
            imgFood = R.drawable.food5,
            foodName = "4 cheese macaroni",
            foodDescription = "Parmesan, mozzarella, gorgonzola and ricotta",
            price = "$ 25.00"
        ),


    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn{
            itemsIndexed(foodList){_,food ->
                FoodItem(food)

            }

        }

    }

}