package RestAssure;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class DemoRecipes {
	
String url = "https://dummyjson.com";
	

// Get All Recipes

    @Test(enabled = false)
    
    public void getAllRecipes() {
    	
    	given().get("https://dummyjson.com/docs/recipes").then().statusCode(200).log().all();
    }
//Get a single recipe
    
    @Test(enabled = false)
    
    public void GetSingleRecipe() {
    	
    	given().get("https://dummyjson.com/recipes/1").then().statusCode(200).log().all();
    }
    
 //Search recipes
    
    @Test(enabled = false)
    
    public void searchRecipes() {
    	
    	given().get("https://dummyjson.com/recipes/search?q=Margherita").then().statusCode(200).log().all();
    }
   
//Limit and skip recipes
    
    @Test(enabled = false)
    
    public void LimitandSkipRecipies() {
    	
    	given().get("https://dummyjson.com/recipes?limit=10&skip=10&select=name,image").then().statusCode(200).log().all();
    }
    
//Sort recipes
    
    @Test(enabled = false)
    
    public void SortRecipes() {
    	
    	given().get("https://dummyjson.com/recipes?sortBy=name&order=asc").then().statusCode(200).log().all();
    }
    
//Get all recipes tags
   
    @Test(enabled = false)

    public void getAllRecipesTags() {
    	
    	given().get("https://dummyjson.com/recipes/tags").then().statusCode(200).log().all();
    }
    
//Get recipes by a tag
    
    @Test(enabled = false)

    public void getARecipeByTag() {
    	
    	given().get("https://dummyjson.com/recipes/tag/Pakistani").then().statusCode(200).log().all();
    }
    
//Get recipes by a meal
    
    @Test(enabled = false)

    public void getRecipesByAMeal() {
    	
    	given().get("https://dummyjson.com/recipes/meal-type/snack").then().statusCode(200).log().all();
    }
    
 //////////////// comments 
    
//Get all comments
    
    @Test(enabled = false)

    public void getAllComments() {
    	
    	given().get("https://dummyjson.com/comments").then().statusCode(200).log().all();
    }
    
//Get a single comment
    
    @Test(enabled = false)

    public void getASingleComment() {
    	
    	given().get("https://dummyjson.com/comments/1").then().statusCode(200).log().all();
    }
    
//Limit and skip comments
    
    @Test(enabled = false)
    
    public void LimitandSkipComments() {
    	
    	given().get("https://dummyjson.com/comments?limit=10&skip=10&select=body,postId").then().statusCode(200).log().all();
    }
    
//Get all comments by post id
    
@Test(enabled = false)
    
    public void getAllCommentsByPostID() {
    	
    	given().get("https://dummyjson.com/comments/post/6").then().statusCode(200).log().all();
    }

//Add a new comment

@Test(enabled = false)

public void AddNewComment() {
	   
	   JSONObject js = new JSONObject();
	   
	   js.put("body","Great Recipes");
	   js.put("postId","3");
	   js.put("userId","5");
	   
	   given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/comments/add").then().log().all();
}

//Update a comment

@Test(enabled = false)

public void UpdateComment() {
	   
	   JSONObject js = new JSONObject();
	   
	   js.put("body","'I think I should shift to the moon'");
	   
	   
	   given().contentType("application/json").body(js.toJSONString()).when().put("https://dummyjson.com/comments/1").then().log().all();
}
   
//Delete a comment

@Test(enabled = true)

public void DeleteComment() {
	
	given().delete("https://dummyjson.com/comments/1").then().statusCode(200).log().all();
}

}
	


