import com.fishyfeast.MoesFishyFeast;
import com.foodstall.api.Foodstall;

module moes.fishy.feast {
    requires foodstall.api;
    provides Foodstall with MoesFishyFeast;
}