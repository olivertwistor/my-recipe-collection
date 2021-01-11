package nu.olivertwistor.myrecipecollection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import nu.olivertwistor.myrecipecollection.databinding.ItemRecipeBinding;

class RecipesAdapter extends ArrayAdapter<Recipe>
{
    private ItemRecipeBinding binding;

    public RecipesAdapter(final Context context, final ArrayList<Recipe> recipes)
    {
        super(context, 0, recipes);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent)
    {
        // Reuse existing view if possible. Otherwise, inflate a new view.
        if (convertView == null)
        {
            convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.item_recipe, parent, false);
        }

        this.binding = ItemRecipeBinding.bind(convertView);

        // Set the data from the model and return the view.
        final Recipe recipe = this.getItem(position);
        this.binding.textviewRecipeName.setText(recipe.getName());
        this.binding.textviewRecipeSource.setText(recipe.getSource());

        return convertView;
    }
}
