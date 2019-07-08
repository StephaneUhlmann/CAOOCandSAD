package ViewUltraVision;

import javax.swing.JOptionPane;
import ConnectionDB.UltraVisionDataBaseConnection;
import MembershipCard.MembershipCard;
//payment page
public class Payment extends javax.swing.JFrame {
	
	//globals for the view
	private javax.swing.JButton jButtonNext;
	private javax.swing.JLabel jLabelMakeapayment;
	private javax.swing.JLabel jLabelNameonCard;
	private javax.swing.JLabel jLabelCardNumber;
	private javax.swing.JLabel jLabelExpireDate;
	private javax.swing.JLabel jLabelSecurityCode;
	private javax.swing.JLabel jLabelGeneratePoints;
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
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	MembershipCard mc = new MembershipCard(0, false);

    public Payment() {
    	//constructor
    	//add components and set view true
        initComponents();
        this.setVisible(true);
    }
                         
    private void initComponents() {

        jLabelMakeapayment = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabelNameonCard = new javax.swing.JLabel();
        jLabelCardNumber = new javax.swing.JLabel();
        jLabelExpireDate = new javax.swing.JLabel();
        jLabelSecurityCode = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jLabelGeneratePoints = new javax.swing.JLabel();
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

        jLabelMakeapayment.setText("Make a payment");

        jLabelNameonCard.setText("Name on Card");

        jLabelCardNumber.setText("Card Number");

        jLabelExpireDate.setText("Expire Date");

        jLabelSecurityCode.setText("Security Code");

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabelGeneratePoints.setText("This transaction will generate 10 points");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNameonCard)
                            .addComponent(jLabelCardNumber)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonNext)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelMakeapayment, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelExpireDate)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelSecurityCode)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelGeneratePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMakeapayment, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameonCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCardNumber)
                .addGap(4, 4, 4)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExpireDate)
                    .addComponent(jLabelSecurityCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabelGeneratePoints)
                .addGap(5, 5, 5)
                .addComponent(jButtonNext)
                .addGap(19, 19, 19))
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
    
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {   

  	    points(); //actual points
  	 /*  
    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database
    	int p = mc.getPoints()+10; //add 10 points per rental
    	String query = "UPDATE `ultravisiondb`.`customer` SET `C_LoyaltyPoints` = '"+ p +"' WHERE (`C_ID` = '3');";
    	
    	db.insert(query); 
    	db.closingAll();
    	
     */
    	if(mc.isfreeRentAllowed()) { //gives a free rental
    		JOptionPane.showMessageDialog(this, "You can have a free rent, enjoy =)");
    		mc.availFreeRent();
    	}else { //show actual points
    		JOptionPane.showMessageDialog(this, "You have earned 10 Loyalty Points. Your total points are "+ mc.getPoints() +"");
    	}
    }
    
    public int points() {

    	mc.addPoints(10); //add points
    	return mc.getPoints()+10;
    	
    }

}


