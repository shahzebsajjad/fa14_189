package calculator;



public class ShopRepository implements Container{
	// an array named my cart with values
	public float Mycart[] = {1 , 2 , 1};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }
// using Iterator
	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	     // index will be incremented until all products from cart are finished 
	         if(index < Mycart.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	 // for cost if less than 5       	 
	        		 float sum=0;
	        		 while(index < Mycart.length)
	        		 sum=sum + Mycart[index++];
	        		 float cost;
	        		 if (sum < 5)
	        		 { 
	        		 cost=(float) (0.75 * sum);
	        		 
	        			 return cost;
	        		 }
	        		 else
	        		 {
	 //cost more than 5       	 
	            return cost=(float) (0.50 * sum);
	            }
	        		 
	         }
	         return null;
	      }		
	   }

}
