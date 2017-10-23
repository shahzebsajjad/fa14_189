package calculator;

public class implementing {
	public static void main(String[] args) {
		// making new object of shop reposatory in main class implementing
	      ShopRepository namesRepository = new ShopRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	    	  
	         float totalPrice = (float)iter.next();
	         
	         System.out.println("your total  : " + totalPrice);
	      } 	
	   }

}