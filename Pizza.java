
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeaway = false;
    // this will help us to modify in future
    private int Vegpizzaprice = 300;
    private int Nonvegpizzaprice = 400;
    private int extraCheese = 80;
    private int extraToppingforVeg = 70;
    private int extraToppingforNonVeg = 120;
    private int takeAway = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true) {
        	this.price += Vegpizzaprice;
        }else {
        	this.price += Nonvegpizzaprice;
        }
    }

	public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
    	if(isCheeseAdded == false) {
    		this.price += extraCheese;
    		isCheeseAdded = true;
    	}
        
    }
 
    public void addExtraToppings(){
    	if(isToppingsAdded == false) {
    		if(isVeg == true) {
    			this.price += extraToppingforVeg;
    		}else {
    			this.price += extraToppingforNonVeg;
    		}
    		isToppingsAdded = true;
    	}
    }

    public void addTakeaway(){
    	if(isTakeaway == false) {
    		this.price += takeAway;
    		isTakeaway = true;
    	}
        
    }

    public String getBill(){
        if(isVeg == true) {
        	this.bill += "Base Price Of The Pizza: " + Vegpizzaprice+"\n" ;
        }else {
        	this.bill += "Base Price Of The Pizza: " + Nonvegpizzaprice+"\n" ;
        }
        if(isCheeseAdded == true) {
        	this.bill += "Extra Cheese Added: " + extraCheese+"\n" ;
        }
        if(isToppingsAdded == true) {
        	if(isVeg == true) {
        		this.bill += "Extra Toppings Added: " + extraToppingforVeg+"\n" ;
        	}else {
        		this.bill += "Extra Toppings Added: " + extraToppingforNonVeg+"\n" ;
        	}
        }
        if(isTakeaway == true) {
        	this.bill += "Paperbag Added: " + takeAway+ "\n" ;
        }
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }

}
