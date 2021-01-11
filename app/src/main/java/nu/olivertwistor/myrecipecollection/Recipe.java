package nu.olivertwistor.myrecipecollection;

class Recipe
{
    private String name;
    private String source;

    public Recipe(final String name, final String source)
    {
        this.name = name;
        this.source = source;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSource()
    {
        return this.source;
    }
}
