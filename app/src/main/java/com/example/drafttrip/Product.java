package com.example.drafttrip;

/**
 * The type Product.
 */
class Product {
    private String Title;
    private String Description ;
    private String Price;
    private int Thumbnail ;

    /**
     * Instantiates a new Product.
     *
     * @param title       the title
     * @param description the description
     * @param price       the price
     * @param thumbnail   the thumbnail
     */
//making class for data which will be printed on product and description page
    public Product(String title, String description, String price, int thumbnail) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
        Price= price;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
// functions used to extract value of above assigned variables.
    public String getTitle() {
        return Title;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * Gets thumbnail.
     *
     * @return the thumbnail
     */
    public int getThumbnail() {
        return Thumbnail;
    }


    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
        Price = price;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail the thumbnail
     */
    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
