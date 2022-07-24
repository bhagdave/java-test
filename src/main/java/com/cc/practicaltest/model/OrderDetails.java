package com.cc.practicaltest.model;

public class OrderDetails {
    private Long order_number;
    private float sale_price;
    private String model_name;
    private String trim_name;
    private String engine_description;
    private String wheel_type;
    private String infotainment_type;
    private String headlight_type;
    private String upholstery_type;

    public OrderDetails() {
    }

    public OrderDetails(Long order_number, float sale_price, String model_name, String trim_name, String engine_description,
            String wheel_type, String infotainment_type, String headlight_type, String upholstery_type) {
        this.order_number = order_number;
        this.sale_price = sale_price;
        this.model_name = model_name;
        this.trim_name = trim_name;
        this.engine_description = engine_description;
        this.wheel_type = wheel_type;
        this.infotainment_type = infotainment_type;
        this.headlight_type = headlight_type;
        this.upholstery_type = upholstery_type;
    }

    public Long getOrderNumber(){
        return order_number;
    }

    public void setOrderNumber(Long order_number){
       this.order_number = order_number;
    }

    public float getSalePrice(){
        return sale_price;
    }

    public void setSalePrice(float sale_price){
        this.sale_price = sale_price;
    }

    public String getModelName(){
        return model_name;
    }

    public void setModelName(String model_name){
        this.model_name = model_name;
    }

    public String getTrimName(){
        return trim_name;
    }

    public void setTrimName(String trim_name){
        this.trim_name = trim_name;
    }

    public String getEngineDescription(){
        return engine_description;
    }

    public void setEngineDescription(String engine_description){
        this.engine_description = engine_description;
    }
    public String getWheelType(){
        return wheel_type;
    }

    public void setWheelType(String wheel_type){
        this.wheel_type = wheel_type;
    }
    public String getInfotainmentType(){
        return infotainment_type;
    }

    public void setInfotainmentType(String infotainment_type){
        this.infotainment_type = infotainment_type;
    }
    public String getHeadlightType(){
        return headlight_type;
    }

    public void setHeadlightType(String headlight_type){
        this.headlight_type = headlight_type;
    }
    public String getUpholsteryType(){
        return upholstery_type;
    }

    public void setUpholsteryType(String upholstery_type){
        this.upholstery_type = upholstery_type;
    }
}
