public class BejeweledQuiz {
	public static void main(String[] args){
		Quiz bjwQuiz = new Quiz("My Bejeweled Quiz");

		bjwQuiz.add(1, "In all Bejeweled games, how many gem colors are there?", "7", "seven");
		bjwQuiz.add(1, "A Flame Gem is created by matching how many gems in a line?", "4", "four");
		bjwQuiz.add(1, "What Special Gem is created by matching 5 gems in a straight line?", "Hypercube", "Hyper Cube");

		bjwQuiz.add(2, "In Bejeweled 1 and 2, how many points does a single 3-gem match score?", "10", "ten");
		bjwQuiz.add(2, "In Bejeweled Twist, Blitz, and 3, how many points does a single 3-gem match score?", "50", "fifty");
		bjwQuiz.add(2, "In Bejeweled 2, how many points does it take to complete Level 1 of Classic mode?", "500", "five hundred");


		bjwQuiz.add(3, "Which Bejeweled 2 mode is unlocked by completing level 17 of Classic mode?", "Twilight", "Twilight Mode");

		bjwQuiz.add(4, "What was the Flame Gem originally known as?", "Power Gem", "power");


		bjwQuiz.add(4, "In Bejeweled Stars, what Special Gem replaced the Supernova Gem?", "Darksphere");
		bjwQuiz.add(7, "How many total non-Eclipse challenge puzzles are there in Bejeweled Twist?", "91");
		bjwQuiz.add(5, "How many game modes exist in Bejeweled 2 Deluxe?", "9", "nine");
		bjwQuiz.add(3, "A Bejewled Twist Blitz Mode game lasts for how many minutes?", "5", "five");
		bjwQuiz.add(8, "In Bejeweled Twist, if the Levelup Tube is filled completely on the same move that a Bomb Gem reaches 0, will the level be completed before the Bomb Gem triggers?", "yes", "y", "true");

		bjwQuiz.giveQuiz(4, 7);

	}
}