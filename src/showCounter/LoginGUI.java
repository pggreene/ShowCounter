/*
	TO DO: Make git repository for this code..
		How to:
			1. download git: https://git-scm.com/download/win
			2. sign into github.com . create a new repository 
			3. open up terminal window, at top of vscode menu: (terminal->new terminal)
			4. run the following commands as provided in the github instructions.
			5. share the repository link with me
*/


package showCounter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;
// import java.nio.file.Files;
// import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

// import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
// import org.json.simple.parser.ParseException;

// import netscape.javascript.JSObject;

public class LoginGUI implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel userLabel;
	private JLabel passLabel;
	private JLabel success;
	private JTextField userText;	
	private JPasswordField passText;
	private JButton button;
	private JButton newLogin;
	private JButton Enter;
	private JButton Display;
	private JTextField showText;
	private JLabel showName;
    private List<String> shows = new ArrayList<>();
    private String episodes;
    private String time;
    int counter = 0;
    private int numOfShows;
    private JLabel numOfEpisodes;
    private JLabel avgTime;
    private JTextField showNumOfEpisodes;
    private JTextField showAvgTime;
    private int Episode;
    private double Time;
    private double timee;
    private float episodess = 0;
    private JButton newLoginInfo;
    private JTextField userCredentials;
    private JTextField passCredentials;
    private JButton calculate;
    private JButton execute;
    private JButton back;
    private JLabel timePerDay;
    private JTextField dailyTime;
    private JPasswordField userPassConf;
    private JLabel passConf;
    private JLabel match;
    private JLabel error;
    private JLabel errorr;
    private JButton goBack;
    private String usernames;
    private String passwords;
    private File directoryPath = new File("C:\\Users\\paulp\\OneDrive\\Documents\\Data\\userCredentials\\");
    private String directory = "C:\\Users\\paulp\\OneDrive\\Documents\\Data\\userCredentials\\";

	public LoginGUI() {
		
	}
	
	public void frame() {
		
		frame = new JFrame(); 
		frame.setSize(500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
	}
	
	public void Login() {
		frame();
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		passLabel = new JLabel("Password: ");
		passLabel.setBounds(10, 80, 80, 25);
		panel.add(passLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passText = new JPasswordField();
		passText.setBounds(100, 80, 165, 25);
		panel.add(passText);
		
		button = new JButton("Login");
		button.setBounds(100, 130, 100, 25);
		button.addActionListener(this);
		panel.add(button);
		newLogin = new JButton("Create Account");
		newLogin.setBounds(100, 180, 150, 25);
		newLogin.addActionListener(this);
		panel.add(newLogin);
		
		success = new JLabel(" ");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		success.setText(null);
		
		frame.setVisible(true);

	}
	public void baseStats() {
		
		showName = new JLabel("Show Name: ");
		showName.setBounds(20, 20, 120, 25);
		panel.add(showName);
	
		showText = new JTextField();
		showText.setBounds(160, 20, 165, 25);
		panel.add(showText);
	
		numOfEpisodes = new JLabel("Number of Episodes: ");
		numOfEpisodes.setBounds(20, 80, 120, 25);
		panel.add(numOfEpisodes);
	
		showNumOfEpisodes = new JTextField();
		showNumOfEpisodes.setBounds(160, 80, 165, 25);
		panel.add(showNumOfEpisodes);
	
		avgTime = new JLabel("Average Time/Episode: ");
		avgTime.setBounds(20, 140, 150, 25);
		panel.add(avgTime);
		
		showAvgTime = new JTextField();
		showAvgTime.setBounds(160, 140, 165, 25);
		panel.add(showAvgTime);
	}
		public void stats() {
		
		frame();
		baseStats();
		Enter = new JButton("Enter");
		Enter.setBounds(160, 190, 100, 25);
		Enter.addActionListener(this);
		panel.add(Enter);
		
		Display = new JButton("Display");
		Display.setBounds(160, 240, 100, 25);
		Display.addActionListener(this);
		panel.add(Display);
		
		calculate = new JButton("Calculate");
		calculate.setBounds(300, 240, 100, 25);
		calculate.addActionListener(this);
		panel.add(calculate);

		frame.setVisible(true);
		
	}
		public void createAccount() {
			
			frame();
			
			userLabel = new JLabel("Username: ");
			userLabel.setBounds(10, 20, 80, 25);
			panel.add(userLabel);
			
			passLabel = new JLabel("Password: ");
			passLabel.setBounds(10, 80, 80, 25);
			panel.add(passLabel);
			
			passConf = new JLabel("Confirm Pass: ");
			passConf.setBounds(10, 140, 90, 25);
			panel.add(passConf);
			
			userCredentials = new JTextField();
			userCredentials.setBounds(100, 20, 165, 25);
			panel.add(userCredentials);
			
			passCredentials = new JPasswordField();
			passCredentials.setBounds(100, 80, 165, 25);
			panel.add(passCredentials);	
			
			userPassConf = new JPasswordField();
			userPassConf.setBounds(100, 140, 165, 25);
			panel.add(userPassConf);
			
			match = new JLabel(" ");
			match.setBounds(10, 170, 150, 25);
			panel.add(match);
			
			newLoginInfo = new JButton("Create Account");
			newLoginInfo.setBounds(100, 200, 150, 25);
			newLoginInfo.addActionListener(this);
			panel.add(newLoginInfo);
			
			goBack = new JButton("Go Back");
			goBack.setBounds(20, 270, 100, 25);
			goBack.addActionListener(this);
			panel.add(goBack);
			
			error = new JLabel("");
			error.setBounds(280, 20, 150, 25);
			panel.add(error);
			
			errorr = new JLabel("");
			errorr.setBounds(280, 80, 150, 25);
			panel.add(errorr);
			
			frame.setVisible(true);
		}
		public void createFile() throws IOException {
			JSONObject user = new JSONObject ();
			user.put("Username", userCredentials.getText());
			user.put("Password", passCredentials.getText());		
			String name = userCredentials.getText()+".json";				
			String contents[] = directoryPath.list();
			
			for(int i = 0; i < contents.length; i++) {
				
				System.out.println(contents[i]);
				
				if(name.equals(contents[i])) {
					System.out.println(contents[i]);
					error.setText("Username already exists");
					System.out.println("Error");
					break;	
				}
			/*	if(userCredentials.getText().equals("")&&passCredentials.getText().equals("")) {
					error.setText("Enter a username");
					errorr.setText("Enter a password");
					break;
				}
				if(userCredentials.getText().equals("")) {
					error.setText("Enter a username");
					break;
				}
				if(passCredentials.getText().equals("")) {
					errorr.setText("Enter a password");
					break;
				}*/
				
				else{						
						FileWriter File = new FileWriter(directory + name);
						File.write(user.toJSONString());
						File.close();
						//frame.dispose();
						//Login();
						//DO NOT put a break statement here
				}
			}
	
	}

	 public void calculate() {
		 frame.dispose();
		 frame();
		 baseStats();
		 execute = new JButton("Execute");
		 execute.setBounds(160, 240, 100, 25);
		 execute.addActionListener(this);
		 panel.add(execute);
		 
		 timePerDay = new JLabel("Hours Watched/day: ");
		 timePerDay.setBounds(20, 200, 150, 25);
		 panel.add(timePerDay);
			
		 dailyTime = new JTextField();
		 dailyTime.setBounds(160, 200, 165, 25);
		 panel.add(dailyTime);
		 
		 back = new JButton("Go Back");
		 back.setBounds(20, 270, 100, 25);
		 back.addActionListener(this);
		 panel.add(back);
			
		 frame.setVisible(true);
	 }

	 /*
		Effects: grabs the username and password from a .json file
		Requires: the filepath to be obtained.
	 */
	 public void readFileForLogin() {
		 // initialize json parser object
		 JSONParser parser = new JSONParser();
		 
		 try {
			/*
				TO DO:
					1. On project run, create new folder called 'userCredentials' inside the project root directory if not already made.
						Store user credentials there. 
					2. Now instead of taking an arbitary filepath "C://Users//paulp//OneDrive...etc" we can prompt code to grab the current
						users filepath to this directory and point it inside of the 'userCredentials' folder we made on app initialization.
					3. This filepath ^ can be saved as a string and used as a variable inside of 
						Object readFile = parser.parse(new FileReader(path-to-folder-variable)
			*/

			// parse the desired json file
			Object readFile = parser.parse(new FileReader("C:\\Users\\paulp\\OneDrive\\Documents\\Data\\userCredentials\\Paul.json"));
			
			JSONObject jsonObject = (JSONObject)readFile;

			usernames = (String)jsonObject.get("Username");
			passwords = (String)jsonObject.get("Password");
			System.out.println("Username: " + usernames);
			System.out.println("Password: " + passwords);
		} catch(Exception e) {
			e.printStackTrace();
	  }
	 }
	public void actionPerformed(ActionEvent login) {
	//Login method is here
		String user = userText.getText();
		String pass = passText.getText();
		if(login.getSource() == button) {
			readFileForLogin();
			//read line 318.
		if(user.equals(usernames) && pass.equals(passwords)) {
			System.out.println("Login Successful");
			frame.dispose();
		    stats();
		  
		}
		else {
			success.setText("Login Failed");			
		}
		}
		if(login.getSource() == newLogin) {
			frame.dispose();
			createAccount();
			
	}
		if(login.getSource() == newLoginInfo) {
			
			String list[] = directoryPath.list();
			
			String name = userCredentials.getText()+".json";
			for(int i = 0; i < list.length; i++) {				
				if(name.equals(list[i])) {
					System.out.println("Another error");
					break;		
				}
				if(userCredentials.getText().equals("")) {
					break;
				}
				if(passCredentials.getText().equals("")) {
					break;
				}
				if(! userCredentials.getText().equals(passCredentials.getText())) {
					match.setText("Passwords do not match");
					System.out.println("Passwords do not match");
				}
				else {
					//frame.dispose();
				//	Login();
					try {
						createFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}	
		if(login.getSource() == Enter) {
			
			shows.add(showText.getText());
			episodes = showNumOfEpisodes.getText();
			episodess += Integer.parseInt(episodes);
			Episode += episodess;
			time = showAvgTime.getText();
			timee += Double.parseDouble(time);
			Time += timee * episodess;
			showText.setText("");
			showNumOfEpisodes.setText("");
			showAvgTime.setText("");
			timee = 0;
			episodess = 0;

		}
		if(login.getSource() == Display) {
			
			System.out.println("Shows watched: " + shows);
			for(numOfShows = 0; numOfShows < shows.size(); numOfShows++) {
			}
			System.out.println("Number of shows watched: " + numOfShows);
			System.out.println("Number of episodes watched: " + Episode);
			System.out.print("Total time spent: ");
			System.out.printf("%.2f", Time/60);
			System.out.print(" hours or ");
			System.out.printf("%.2f", Time/60/24);
			System.out.print(" days");
			System.out.println();			
		}
		if(login.getSource() == calculate) {
			calculate();
		}
		if(login.getSource() == execute) {
			String episodes = showNumOfEpisodes.getText();
			int episode = Integer.parseInt(episodes);
			String times = showAvgTime.getText();
			double time = Double.parseDouble(times);
			String daily = dailyTime.getText();
			double hours = Double.parseDouble(daily);
			double days = (episode * time)/60/hours;
			System.out.print("It will take ");
			System.out.printf("%.2f", days);
			System.out.println(" day/s to watch the show ");
			System.out.println(showText.getText() + " if you spent " + dailyTime.getText() + " hour/s a day");
			showText.setText("");
			showNumOfEpisodes.setText("");
			showAvgTime.setText("");
			dailyTime.setText("");
			
		}
		if(login.getSource() == back) {
			frame.dispose();
			stats();
		}
		if(login.getSource() == goBack) {
			frame.dispose();
			Login();
			
		}
}
//Notes to self - Clear console, how to indent a list every few lines, maybe add avg time/show?
	public static void main(String[] args) {
		
		LoginGUI login = new LoginGUI();
		login.Login();
		
	}

}
