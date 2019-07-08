package ViewUltraVision;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ConnectionDB.UltraVisionDataBaseConnection;
//return title view
public class ReturnTitle extends javax.swing.JFrame {
	
	//globals for the view
	private javax.swing.JButton jButtonReturnTitle;
	private javax.swing.JComboBox<String> jComboBox;
	private javax.swing.JLabel jLabelSelectTitle;
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

    public ReturnTitle() {
    	//constructor
    	//add components and set view true
    	
        initComponents();
        this.setVisible(true);
        db();
        
    }
                       
    private void initComponents() {

        jComboBox = new javax.swing.JComboBox<>();
        jLabelSelectTitle = new javax.swing.JLabel();
        jButtonReturnTitle = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCustomer = new javax.swing.JMenu();
        jMenuItemAddNewCustomer = new javax.swing.JMenuItem();
        jMenuItemSearchCustomer = new javax.swing.JMenuItem();
        jMenuTitle = new javax.swing.JMenu();
        jMenuRent = new javax.swing.JMenu();
        jMenuItemAddNewTitle = new javax.swing.JMenuItem();
        jMenuItemSearchTitles = new javax.swing.JMenuItem();
        jMenuItemRentaTitle = new javax.swing.JMenuItem();
        jMenuItemReturnaTitle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSelectTitle.setText("Select a Title on the list to return");

        jButtonReturnTitle.setText("Return Title");
        jButtonReturnTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnTitleActionPerformed(evt);
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
        jMenuItemSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSearchCustomerActionPerformed(evt);
            }
        });
        jMenuCustomer.add(jMenuItemSearchCustomer);

        jMenuBar.add(jMenuCustomer);

        jMenuTitle.setText("Title");

        jMenuItemAddNewTitle.setText("Add New Title");
        jMenuItemAddNewTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddNewTitleActionPerformed(evt);
            }
        });
        jMenuTitle.add(jMenuItemAddNewTitle);

        jMenuItemSearchTitles.setText("Search Titles");
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

        //GUI Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSelectTitle)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButtonReturnTitle)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabelSelectTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButtonReturnTitle)
                .addGap(70, 70, 70))
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
    
    private void jButtonReturnTitleActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	
    	JOptionPane.showMessageDialog(this, "Title returned with success."); //displays success to the user
    	
    	//query to set the title available 1 to available and 0 to rented
    	String querry = "UPDATE `ultravisiondb`.`title` SET `T_Active` = '1' WHERE (`T_ID` = '"+ id +"');";
    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database
    	db.insert(querry);
    	
    	db.closingAll();	//close connection
    } 
    

	public void db() {
		
    	String querry = "SELECT * FROM ultravisiondb.title where T_Active = 0;"; //select all the rented titles

    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection();
    	String [] data = new String [10];
    	
    	db.select(querry);
    	
    	ResultSet rs = db.getRs();
    	int i = 0;
    	
    	try {
    		while(rs.next()) {
    			
    			data [i] = rs.getString("T_Name"); //show the results and add to the combobox
    			id = rs.getString("T_ID");
    			jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(data));
    			i++;
    			
    		}
    	} catch (SQLException e) {
    		
    		e.printStackTrace();
    	}

    	db.closingAll(); //close connection

    }
    	
             
}

