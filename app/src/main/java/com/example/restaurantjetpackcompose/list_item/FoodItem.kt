package com.example.restaurantjetpackcompose.list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.restaurantjetpackcompose.R

@Composable
fun FoodItem (

){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(0.dp, 10.dp, 0.dp, 10.dp)
    ) {

        val (
        imgFood,
        txtFoodName,
        txtFoodDescription,
        txtPrice,
        btAddCart,
        containerImg,
        rowItem
        ) = createRefs()

        Card (
            modifier = Modifier
                .constrainAs(containerImg) {

                }
                .size(30.dp)
                .padding(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                shape = ShapeDefaults.Medium,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                )

                ){

        }
        Image(
            painter = painterResource(id = R.drawable.food1 ),
            contentDescription = )
    }
}

@Composable
@Preview
private fun FoodItemPreview (){
    FoodItem()
}