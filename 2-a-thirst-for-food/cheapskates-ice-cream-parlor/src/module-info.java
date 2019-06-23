import com.foodstall.api.Foodstall;
import com.icecream.IceCreamParlor;

module cheapskates.ice.cream.parlor {
    requires foodstall.api;
    provides Foodstall with IceCreamParlor;
}