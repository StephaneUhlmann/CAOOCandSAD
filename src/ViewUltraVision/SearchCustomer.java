package ViewUltraVision;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ConnectionDB.UltraVisionDataBaseConnection;
//search Customer view
public class SearchCustomer extends javax.swing.JFrame {
	
	//globals for the view
	private javax.swing.JButton jButtonSearch;
	private javax.swing.JLabel jLabelSearchCustomer;
	private JLabel jLabelNameSearch;
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
	private JTextField jTextField;

    public SearchCustomer() {
    	//constructor
    	//add components and set view true
        initComponents();
        this.setVisible(true);
    }
                        
    private void initComponents() {

        jLabelSearchCustomer = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jTextField = new javax.swing.JTextField();
        jLabelNameSearch = new javax.swing.JLabel();
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

        jLabelSearchCustomer.setText("Search a existent Customer");
        jLabelNameSearch.setText("Type the customer name to search");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jMenuBar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar.setToolTipText("");

        jMenuCustomer.setText("Customer");

        jMenuItemAddNewCustomer.setText("Add New Customer");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabelSearchCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSearch)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(jLabelNameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelSearchCustomer)
                .addGap(24, 24, 24)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButtonSearch)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
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
    
    public String getjTextField1() {
    	//get text jTextField
    	return jTextField.getText();
    }
    
    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) { 
    	//searches for a existing customer on the database

    	String name = this.getjTextField1(); //get customer name
    	String query = "SELECT * FROM ultravisiondb.customer where C_Name = '" + name + "';"; //select customer name from the database

    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database

    	db.select(query);
    	String [][] data = new String [10][10];
    	ResultSet rs = db.getRs(); //database results

    	int i = 0;

    	try {
    		while(rs.next()) {
    			//results to string and displayed to the user
    			data[i][0] = "Customer: ";
    			data[i][1] = rs.getString("C_Name");
    			data[i][2] = "Subscription Plan: ";
    			data[i][3] = rs.getString("C_Subscription");
    			data[i][4] = "Membership Card Number: ";
    			data[i][5] = rs.getString("C_MembershipCard");
    			data[i][6] = "Loyalty Points: ";
    			data[i][7] = rs.getString("C_LoyaltyPoints");
    			i++;

    		}
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}

    	JOptionPane.showMessageDialog(this, data); //displays the researched info
    	db.closingAll();	//close connection

    }

}