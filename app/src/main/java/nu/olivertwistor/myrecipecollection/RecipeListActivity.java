package nu.olivertwistor.myrecipecollection;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecipeListActivity extends AppCompatActivity
{
    public RecipeListActivity()
    {
        super(R.layout.activity_recipe_list);
    }

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
        {
            final Bundle bundle = new Bundle();
            bundle.putInt("some_int", 0);

            this.getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.fragment_container_view, RecipeListFragment.class, bundle).commit();
        }
    }
}
