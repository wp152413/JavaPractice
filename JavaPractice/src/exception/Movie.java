/**
 * 
 */
package exception;

/**
 * <pre>
 * exception
 *  |_Movie
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 31.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public class Movie {
		String title;
		int limitAge;
		

		public Movie(){
		}
		
		public Movie(String title, int limitAge){
			this.title=title;
			this.limitAge=limitAge;
		}

		public String getTitle() {
			return title;
		}

		public int getLimitAge() {
			return limitAge;
		}
		
		public void buyTicket(int age) throws Exception{
			
			if(this.limitAge<=age)
				System.out.println(this.title+" 즐감하세요.");
			try{if(this.limitAge>age){
					throw new Exception(this.title+"은/는"+this.limitAge+"세 이상 관람가입니다.");
					}
			} catch(Exception e){
				
				throw e;
			}
		}
		
}

