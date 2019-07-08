package ViewUltraVision;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ConnectionDB.UltraVisionDataBaseConnection;
import Customer.MusicLover;
import Customer.Premium;
import Customer.TVLover;
import Customer.VideoLover;
import Title.Media;
//rental view
public class Rent extends javax.swing.JFrame {

	//globals for the view
	private javax.swing.JButton jButtonNext;
	private javax.swing.JComboBox<String> jComboBoxTitlesBox;
	private javax.swing.JComboBox<String> jComboBoxChoosePlan;
	private javax.swing.JLabel jLabelChooseaTitle;
	private javax.swing.JLabel jLabelChoosePlan;
	private javax.swing.JMenu jMenuCustomer;
	private javax.swing.JMenu jMenuTitle;
	private javax.swing.JMenu jMenuRent;
	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenuItem jMenuItemAddNewTitle;
	private javax.swing.JMenuItem jMenuItemAddNewCustomer;
	private javax.swing.JMenuItem jMenuItemSearchCustomer;
	private javax.swing.JMenuItem jMenuItemSearchTitles;
	private javax.swing.JMenuItem jMenuItemRentaTitle;
	private javax.swing.JMenuItem jMenuItemReturnaTitle;
	private String id;

	public Rent() {
		//constructor
    	//add components and set view true
		initComponents();
		this.setVisible(true);
	}

	private void initComponents() {

		jComboBoxTitlesBox = new javax.swing.JComboBox<>();
		jComboBoxChoosePlan = new javax.swing.JComboBox<>();
		jLabelChooseaTitle = new javax.swing.JLabel();
		jLabelChoosePlan = new javax.swing.JLabel();
		jButtonNext = new javax.swing.JButton();
		jMenuBar = new javax.swing.JMenuBar();
		jMenuCustomer = new javax.swing.JMenu();
		jMenuItemAddNewCustomer = new javax.swing.JMenuItem();
		jMenuItemSearchCustomer = new javax.swing.JMenuItem();
		jMenuTitle = new javax.swing.JMenu();
		jMenuItemAddNewTitle = new javax.swing.JMenuItem();
		jMenuItemSearchTitles = new javax.swing.JMenuItem();
		jMenuRent = new javax.swing.JMenu();
		jMenuItemRentaTitle = new javax.swing.JMenuItem();
		jMenuItemReturnaTitle = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("UltraVision");
		setPreferredSize(new java.awt.Dimension(400, 400));

		jLabelChoosePlan.setFont(new java.awt.Font("Tahoma", 0, 14));
		jLabelChoosePlan.setText("Choose a Subscription Plan");

		//jcombobox to select the subscription plan
		jComboBoxChoosePlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Music Lover", "Video Lover", "TV Lover", "Premium" }));
		jComboBoxChoosePlan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxChoosePlanActionPerformed(evt);
			}
		});


		jLabelChooseaTitle.setFont(new java.awt.Font("Tahoma", 0, 14));
		jLabelChooseaTitle.setText("Choose a Title");

		jButtonNext.setText("Next");
		jButtonNext.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonNextActionPerformed(evt);
			}
		});

		jMenuBar.setBackground(new java.awt.Color(0, 0, 0));
		jMenuBar.setToolTipText("");

		jMenuCustomer.setText("Customer");

		jMenuItemAddNewCustomer.setText("Add New Customer");
		jMenuItemAddNewCustomer.setToolTipText("");
		jMenuItemAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemAddNewCustomerActionPerformed(evt);
			}
		});

		jMenuCustomer.add(jMenuItemAddNewCustomer);

		jMenuItemSearchCustomer.setText("Search Customer");
		jMenuItemSearchCustomer.setToolTipText("");
		jMenuItemSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSearchCustomerActionPerformed(evt);
			}
		});

		jMenuCustomer.add(jMenuItemSearchCustomer);

		jMenuBar.add(jMenuCustomer);

		jMenuTitle.setText("Title");

		jMenuItemAddNewTitle.setText("Add New Title");
		jMenuItemAddNewTitle.setToolTipText("");
		jMenuItemAddNewTitle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemAddNewTitleActionPerformed(evt);
			}
		});

		jMenuTitle.add(jMenuItemAddNewTitle);

		jMenuItemSearchTitles.setText("Search Titles");
		jMenuItemSearchTitles.setToolTipText("");
		jMenuItemSearchTitles.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSearchTitlesActionPerformed(evt);
			}
		});

		jMenuTitle.add(jMenuItemSearchTitles);

		jMenuBar.add(jMenuTitle);

		jMenuRent.setText("Rent");

		jMenuItemRentaTitle.setText("Rent a Title");
		jMenuItemRentaTitle.setToolTipText("");
		jMenuItemRentaTitle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemRentaTitleActionPerformed(evt);
			}
		});

		jMenuRent.add(jMenuItemRentaTitle);

		jMenuItemReturnaTitle.setText("Return a Title");
		jMenuItemReturnaTitle.setToolTipText("");
		jMenuItemReturnaTitle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemReturnaTitleActionPerformed(evt);
			}
		});
		jMenuRent.add(jMenuItemReturnaTitle);

		jMenuBar.add(jMenuRent);

		setJMenuBar(jMenuBar);

		setJMenuBar(jMenuBar);

		//GUI Layout
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(61, 61, 61)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelChooseaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabelChoosePlan)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButtonNext)
														.addComponent(jComboBoxTitlesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jComboBoxChoosePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 62, Short.MAX_VALUE)))
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(39, 39, 39)
						.addComponent(jLabelChoosePlan)
						.addGap(18, 18, 18)
						.addComponent(jComboBoxChoosePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
						.addComponent(jLabelChooseaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jComboBoxTitlesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(34, 34, 34)
						.addComponent(jButtonNext)
						.addGap(41, 41, 41))
				);

		pack();
		this.validate();
		this.repaint();
	}                     

	private void jMenuItemAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) { 
		//event to go to the add new customer page
		new AddNewCustomer();
		this.dispose();
	}  
	private void jMenuItemSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) { 
		//event to go to the search customer page
		new SearchCustomer();
		this.dispose();
	} 
	private void jMenuItemAddNewTitleActionPerformed(java.awt.event.ActionEvent evt) {  
		//event to go to the add new title page
		new AddNewTitle();
		this.dispose();
	}  
	private void jMenuItemSearchTitlesActionPerformed(java.awt.event.ActionEvent evt) {   
		//event to go to the search title page
		new SearchTitle();
		this.dispose();
	}
	private void jMenuItemRentaTitleActionPerformed(java.awt.event.ActionEvent evt) {   
		//event to go to the rental page
		new Rent();
		this.dispose();
	}  
	private void jMenuItemReturnaTitleActionPerformed(java.awt.event.ActionEvent evt) {    
		//event to go to the return title page
		new ReturnTitle();
		this.dispose();
	}                                          

	public String getjComboBoxSubscriptionBox() {
		//get jcombobox selection
		return (String) jComboBoxChoosePlan.getSelectedItem();
	}
	
	public String getjComboBoxTitlesBox() {
		//get jcombobox selection
		return (String) jComboBoxTitlesBox.getSelectedItem();
	}

	public void setjComboBoxTitlesBox(javax.swing.JComboBox<String> jComboBoxTitlesBox) {
		//set jcombobox titles
		this.jComboBoxTitlesBox = jComboBoxTitlesBox;
	}
	
	private  void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) { 
		
        UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database
        String title = this.getjComboBoxTitlesBox(); //get jcombobox selection 
        //searches for the titles within the selected subscription plan
        String query = "SELECT T_ID FROM ultravisiondb.title where T_Name = '"+ title +"';";  
        
    	
        db.select(query); //query to the database
        ResultSet rs = db.getRs(); //return result set

		String query2 = "UPDATE ultravisiondb.title SET T_Active = '0' WHERE (T_ID = '15');";	//query set rental 0 for rented 1 for available
		db.insert(query2); //query to the database
		
    	db.closingAll(); //close query
		
		
		new Payment(); //go to payment page
		this.dispose();
	}

	private  void jComboBoxChoosePlanActionPerformed(java.awt.event.ActionEvent evt) { 
		
		UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database
		MusicLover ml = new MusicLover(null); //new customer
		TVLover tv = new TVLover(null);
		VideoLover vl = new VideoLover(null);
		Premium p = new Premium(null);


		String Subscription = this.getjComboBoxSubscriptionBox(); //get subscription type

        //if subscription type is selected the database will display only the media available to that user
		if(Subscription.equals("Music Lover")) {
			db.select(ml.toString()); 
		}
		else if(Subscription.equals("Video Lover")) {
			db.select(vl.toString());
		}
		else if(Subscription.equals("TV Lover")) {
			db.select(tv.toString());
		}
		else if(Subscription.equals("Premium")) {
			db.select(p.toString());
		}

		String [] data = new String [10];

		ResultSet rs = db.getRs();
		int i = 0;

		try {
			while(rs.next()) {

				data [i] = rs.getString("T_Name"); //title add to the string
				id = rs.getString("T_ID");
				jComboBoxTitlesBox.setModel(new javax.swing.DefaultComboBoxModel<>(data)); //string of titles add to the ComboBox
				i++;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//query to set the title as rented (1 to available and 0 to rented)
    	String querry = "UPDATE `ultravisiondb`.`title` SET `T_Active` = '0' WHERE (`T_ID` = '"+ id +"');";
    	db.insert(querry);
    	db.closingAll();	//close connection

	}
	
	
	public ArrayList<String> renttitles(){
		Media t = new Media(null, 0);
		t.rent();
		
		return null;
	}

}
	
