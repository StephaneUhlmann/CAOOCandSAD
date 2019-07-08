package ViewUltraVision;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ConnectionDB.UltraVisionDataBaseConnection;
import Customer.MusicLover;
import Enum.SubscriptionTypes;
//add a new customer view
public class AddNewCustomer extends javax.swing.JFrame {

	//globals for the view
    private javax.swing.JButton jButtonAddNewCustomer;
    private javax.swing.JComboBox<String> jComboBoxSubscriptionBox;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSubscriptionPlan;
    private javax.swing.JLabel jLabelAddNewCustomer;
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
      
    public AddNewCustomer() {
    	//constructor
    	//add components and set view true
        initComponents();
        this.setVisible(true);
    }
                      
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelSubscriptionPlan = new javax.swing.JLabel();
        jComboBoxSubscriptionBox = new javax.swing.JComboBox<>();
        jTextField = new javax.swing.JTextField();
        jButtonAddNewCustomer = new javax.swing.JButton();
        jLabelAddNewCustomer = new javax.swing.JLabel();
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
        setTitle("UltraVision"); //set title
        setPreferredSize(new java.awt.Dimension(400, 400)); //set size

        jLabelName.setText("Name"); 

        jLabelSubscriptionPlan.setText("Subscription Plan");
        //jcombobox to select the type of subscription plan
        jComboBoxSubscriptionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Music Lovers: Music CDs and Live Concert Videos", "Video Lovers: Movies (excluding Live Concert Videos)", "TV Lover: Box Sets", "Premium: All titles" }));
        jComboBoxSubscriptionBox.getSelectedIndex();
        
        jButtonAddNewCustomer.setText("Add Customer");
        jButtonAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewCustomerActionPerformed(evt);
            }
        });

        

        jLabelAddNewCustomer.setText("Add a New Customer");

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
        
        //GUI Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddNewCustomer)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelName)
                                .addComponent(jLabelSubscriptionPlan)
                                .addComponent(jComboBoxSubscriptionBox, 0, 368, Short.MAX_VALUE)
                                .addComponent(jTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabelAddNewCustomer)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAddNewCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabelSubscriptionPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSubscriptionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButtonAddNewCustomer)
                .addContainerGap())
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

    public String getjComboBoxSubscriptionBox() {
    	//get jcombobox selection
		return (String) jComboBoxSubscriptionBox.getSelectedItem();
	}

	public String getjTextField() {
		//get text jTextField
		return jTextField.getText();
	}

	private void jButtonAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	// button add the customer to the database
    	MusicLover vl = new MusicLover(null); //new customer
    	
    	String name = this.getjTextField(); //get name
    	String Subscription = this.getjComboBoxSubscriptionBox(); //get subscription type
    	
    	vl.setName(name);  //set name
    	
    	//if (type of subscription type) set enum for the subscription type
    	if(Subscription.equals("Music Lovers: Music CDs and Live Concert Videos")) {
    		vl.setSubscriptionType(SubscriptionTypes.MUSICLOVER); 
    	}
    	else if(Subscription.equals("Video Lovers: Movies (excluding Live Concert Videos)")) {
    		vl.setSubscriptionType(SubscriptionTypes.VIDEOLOVER);
    	}
    	else if(Subscription.equals("TV Lover: Box Sets")) {
    		vl.setSubscriptionType(SubscriptionTypes.VIDEOLOVER);
    	}
    	else if(Subscription.equals("Premium: All titles")) {
    		vl.setSubscriptionType(SubscriptionTypes.PREMIUM);
    	}
    	
    	vl.getMembershipNumber(); //get mebership number
    	
    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database
    	
    	db.insert(vl.toString()); //toString query to the database
    	db.closingAll(); //close connection
    	
    	JOptionPane.showMessageDialog(this, "Customer added with success"); //displays success to the user
    }  
    
}
