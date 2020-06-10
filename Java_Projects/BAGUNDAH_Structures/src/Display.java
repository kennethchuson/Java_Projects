
public class Display {
	
	//Gameplay Display 
	public static String[][] matrix_1 = {{". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "}, 
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "}, 
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "}};
	
	 public static String[][] matrix_2 = {{". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
		      {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			  {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "}}; 
	 
	 public static String[][] matrix_3 =   {{". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "},
			 {". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". ",". "}}; 
			 


	
	//lists of bugs
	public static void bug_lists() {
		System.out.println("-----------[Choose your bugs]-------------");
		System.out.println("1.) Bugla ");
		System.out.println("2.) Spida ");
		System.out.println("3.) Wormak ");
		System.out.println("4.) Criketo ");
		System.out.println("5.) Camoscorp ");
		System.out.println("6.) Blackishbarkung"); 
		System.out.println("------------------------------------------");
	}
	
	//Menu option
	public static void menu() {
		
		System.out.println("-----------[BAGUNDAH GAME]----------------");
		System.out.println("1.) View bugs 2.) Choose bugs 3.) Settings");
	}
	
	//back print 
	public static void back() {
		System.out.println("-----------------------------------");
		System.out.println("0.) BACK ");
	}
	
	//bug choose for view 
	public static void view_bugs() {
		bug_lists(); 
		System.out.println("select a bug you want to view");
		back(); 
	}
	
	
	
	//view bugs status 
	public static void view_Bugla() {
		System.out.println("----------[Bugla]------------");
		System.out.println("Life Span: 100 ");
		System.out.println("weight 10.5 oz"); 
		System.out.println("height: 5.0 in");
		back(); 
		
	}
	
	public static void view_Spida() {
		System.out.println("----------[Spida]------------");
		System.out.println("Life Span: 150 ");
		System.out.println("weight 9.0 oz"); 
		System.out.println("height: 7.0 in");
		back(); 
	}
	
	public static void view_Wormak() {
		System.out.println("----------[Wormak]------------");
		System.out.println("Life Span: 50 ");
		System.out.println("weight 8.7 oz"); 
		System.out.println("height: 14 in");
		back(); 
		
	}
	
	public static void view_Criketo() {
		System.out.println("----------[Criketo]------------");
		System.out.println("Life Span: 80 ");
		System.out.println("weight 10.0 oz"); 
		System.out.println("height: 5.5 in");
		back(); 
	}
	
	public static void view_Camoscorp() {
		System.out.println("----------[Camoscorp]------------");
		System.out.println("Life Span: 40 ");
		System.out.println("weight 4.0 oz"); 
		System.out.println("height: 3.2 in");
		back(); 
	}
	
	public static void view_Blackishbarkung() {
		System.out.println("----------[Blackishbarkung]------------");
		System.out.println("Life Span: 100 ");
		System.out.println("weight 9.3 oz"); 
		System.out.println("height: 4.0 in");
		back(); 
	}
	
	//choose bugs status 
	public static void choose_bugs() {
		bug_lists(); 
		System.out.println("select 2 bugs in the game");
		back(); 
	}
	
	//choose grid size 
	public static void displayGridSize() {
		System.out.println("------------[Select a grid size]---------");
		System.out.println("1.) 6 * 12 ");
		System.out.println("2.) 12 * 18");
		System.out.println("3.) 18 * 24");
	}
	
	//game Display 
	public static void GameBoundUP() {
		System.out.println("--------------------------------------------");
	}
	
	public static void GameBoundDOWN() {
		System.out.println("--------------------------------------------");
	}
	
	public static void enterRow() {
		System.out.println("Enter your row ");
	}
	
	public static void enterCol() {
		System.out.println("Enter your col "); 
	}
	
	//for setting options
	public static void displaySettings() {
		System.out.println("1.) Turn OFF player targets?"); 
		System.out.println("2.) Turn ON player targets?"); 
		System.out.println("-----------------------------"); 
		System.out.println("0.) Back"); 
	}

	
}
