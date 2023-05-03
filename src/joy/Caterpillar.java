package joy;

/**
 * 
 * @author JOYSTON DSOUZA
 * @version (1)
 * class Caterpillar create class for a Caterpillar
 * <p>
 * this class simulates the working of a Caterpillar
 * which does two things
 * it moves and eats
 * </p>
 *
 */

public class Caterpillar {
	
		
		private int moves;
		private int cabbages_eaten;
		
		/**
		 * this is the constructor used to initialize the attributes
		 * eaten and moves </p>
		 * @param moves - number of moves made by caterpillar
		 * @param eaten - number of cabbages eaten by caterpillar
		 */

		public Caterpillar(int moves, int eaten)
		{
			this.setMoves(moves);
			this.setCabbages_eaten(eaten);
		}
		
		/**
		 * This is the method to get the number of moves made by caterpillar
		 * @return - number of moves
		 */
		
		int getMoves() {
			return moves;
		}

		/**
		 * This method to set the moves to be made by the caterpillar <p>
		 * @param moves moves to make
		 */
		void setMoves(int moves) {
			this.moves = moves;
		}

		/**
		 * this is a method used  to get the cabbage eaten <p> 
		 * @return - the cabbage eaten 
		 */
		int getCabbages_eaten() {
			return cabbages_eaten;
		}
		/**
		 * This method to set  the cabbage eaten <p>
		 * @param cabbages_eaten -the number of cabbage eaten
		 */
		void setCabbages_eaten(int cabbages_eaten) {
			this.cabbages_eaten = cabbages_eaten;
		}
		
		/**
		 * This method increments the number of moves <p>
		 * In particular for every move made the number is incremented by one  
		 */
		void move()
		{
			setMoves(getMoves() + 1);
		}

		/**
		 * This method increments the number of cabbage eaten <p>
		 * In particular for every cabbage eaten made the <br> number of cabbage eaten is incremented by one  
		 */
		void eat()
		{
			this.setCabbages_eaten(this.getCabbages_eaten() + 1);
		}
		/**
		 * This method displays the following : <p>
		 * 1) number of moves made<p>
		 * 2)number of cabbages eaten
		 * 
		 * @see getMoves()
		 * @see getCabbages_eaten()
		 */
		void display()
		{
			System.out.println("Moves made =" + getMoves());
			System.out.println("Cabbages eaten =" + getCabbages_eaten());
		}
		
		/**
		 * this is the main program <p>
		 * this is the entry point to run objects to caterpillar class
		 * @param args - array of arguments 
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Caterpillar fred = new Caterpillar(0,0);
			fred.move();
			fred.eat();
			fred.display();
		}

	}



