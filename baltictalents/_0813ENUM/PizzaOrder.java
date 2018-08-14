package lt.baltictalents._0813ENUM;

public class PizzaOrder {
    private int id;
    private String name;
    private String phoneNumber;
    private String order;
    private String type;

    //constructor
    public PizzaOrder() {
        setId (1000);
        setName ("testname");
        setPhoneNumber ("xxxx");
        setOrder ("testorder");
        setType ("testtype");
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setType(String type) {
        this.type = type;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getOrder() {
        return order;
    }

    public String getType() {
        return type;
    }


    //declaring variables for methods of cost and total cost of pizza

    double totalCost; //c is the total cost (in dollars)
    double price; //p is the cost of the pizza
    double deliveryCost; //t is cost of the delivery


    //method for determining pizza price
    public double determinePizzaPrice(){
        if (getOrder().equals("Hawaiian")){
            price = 14.95;
        }//end if for order Hawaiian
        else if (getOrder().equals("Meat Lovers")){
            price = 17.95;
        }//end else-if for order Meat Lovers

        else if (getOrder().equals("Aussie")){
            price = 16.95;
        }
        //end else-if for order Aussie
        else if (getOrder().equals("Supreme")){
            price = 15.95;
        }//end else-if for order Supreme
        else if (getOrder().equals("Pepperoni")){
            price = 13.95;
        }//end else-if for order Pepperoni
        else {
            System.out.println("Error: Incorrect Order name has been entered. Please ensure it is spelt correctly");
        }//end else
        return price;
    }


    public double totalCost(){
        if (getType().equals("Pick-up")){
            deliveryCost = 0;
        }//end if delivery
        else if (getType().equals("Delivery")){
            deliveryCost = 7;
        }//end else-if delivery
        return totalCost = price + deliveryCost;
    }
}

