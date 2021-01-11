package nu.olivertwistor.myrecipecollection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import nu.olivertwistor.myrecipecollection.databinding.RecipeListBinding;

class RecipeListFragment extends Fragment
{
    private RecipeListBinding binding;

    public RecipeListFragment()
    {
        super(R.layout.recipe_list);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState)
    {
        this.binding = RecipeListBinding.inflate(inflater, container, false);
        final View view = this.binding.getRoot();

        ArrayList<Recipe> recipes = new ArrayList<>();
        RecipesAdapter adapter = new RecipesAdapter(this.getContext(), recipes);
        this.binding.recipeList.setAdapter(adapter);

        recipes.add(new Recipe("Janssons frestelse", "Vår kokbok"));

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable final Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        final int someInt = this.requireArguments().getInt("some_int");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        this.binding = null;
    }
}
