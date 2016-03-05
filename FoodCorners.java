package com.example.lenovo.foodiedude.model;

/**
 * Created by Lenovo on 1/22/2016.
 */

public class FoodCorners {


    int _id;
    String _name;
    String _address;
    String _area;




    public FoodCorners()
    {

    }
    public FoodCorners(int Id,String Name ,String Address, String Area)
    {

        this._id=Id;
        this._name=Name;
        this._address=Address;
        this._area=Area;

    }

    public FoodCorners(String Name,String Address, String Area)
    {
        this._name=Name;
        this._address=Address;
        this._area=Area;

    }

    public int getId()
    {
        return this._id;
    }
    public void setId(int Id)
    {
        this._id=Id;
    }

    public String getName()
    {
        return this._name;
    }
    public void setName(String Name)
    {
        this._name=Name;
    }

    public String getAddress()
    {
        return this._address;
    }
    public void setAddress(String Address)
    {
        this._address=Address;
    }
    public String getArea()
    {
        return this._area;
    }
    public void setArea(String Area)
    {
        this._area=Area;
    }



}
