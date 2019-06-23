import com.foodstall.api.Foodstall;
import com.wafflehouse.WaffleHouse;

module wild.west.waffle.house {
    requires foodstall.api;
    provides Foodstall with WaffleHouse;
}