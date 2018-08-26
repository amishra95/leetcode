
public class asteroidCollision {
	 public int[] asteroidCollision(int[] asteroids) {
	        
		    Stack<Integer> stack = new Stack();
		        asteroids:
		 
		        for(int ast : asteroids){
		            while(!stack.isEmpty() && ast < 0 && 0 < stack.peek())
		                if(-ast < stack.peek() ||  -ast == stack.pop())
		                    continue asteroids;
		            stack.push(ast);
		        }
		        return stack.stream().mapToInt(i->i).toArray();
		        
		    
		}
}
