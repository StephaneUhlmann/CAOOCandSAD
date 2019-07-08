package ViewUltraVision;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ConnectionDB.UltraVisionDataBaseConnection;
import Enum.MediaTypes;
import Title.Media;
//add a new title view
public class AddNewTitle extends javax.swing.JFrame {
    
	//globals for the view
	private javax.swing.JButton jButtonAddTitle;
	private javax.swing.JComboBox<String> jComboBoxMediaBox;
	private javax.swing.JLabel jLabelTitleName;
	private javax.swing.JLabel jLabelTitleYear;
	private javax.swing.JLabel jLabelTitleType;
	private javax.swing.JLabel jLabelAddaNewTitle;
	private javax.swing.JMenu jMenuCustomer;
	private javax.swing.JMenu jMenuTitle;
	private javax.swing.JMenu jMenuRent;
	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenuItem jMenuItemAddaNewTitle;
	private javax.swing.JMenuItem jMenuItemAddNewCustomer;
	private javax.swing.JMenuItem jMenuItemSearchCustomer;
	private javax.swing.JMenuItem jMenuItemSearchTitles;
	private javax.swing.JMenuItem jMenuItemRentaTitle;
    private javax.swing.JMenuItem jMenuItemReturnaTitle;
	private JTextField jTextField;
	private javax.swing.JSpinner jSpinner;

    public AddNewTitle() {
    	//constructor
    	//add components and set view true
        initComponents();
        this.setVisible(true);
    }
                     
    private void initComponents() {

        jLabelTitleName = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jLabelTitleYear = new javax.swing.JLabel();
        jComboBoxMediaBox = new javax.swing.JComboBox<>();
        jLabelTitleType = new javax.swing.JLabel();
        jButtonAddTitle = new javax.swing.JButton();
        jLabelAddaNewTitle = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCustomer = new javax.swing.JMenu();
        jMenuItemAddNewCustomer = new javax.swing.JMenuItem();
        jMenuItemSearchCustomer = new javax.swing.JMenuItem();
        jMenuTitle = new javax.swing.JMenu();
        jMenuItemAddaNewTitle = new javax.swing.JMenuItem();
        jMenuItemSearchTitles = new javax.swing.JMenuItem();
        jMenuRent = new javax.swing.JMenu();
        jMenuItemRentaTitle = new javax.swing.JMenuItem();
        jMenuItemReturnaTitle = new javax.swing.JMenuItem();
        jSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UltraVision");
        setPreferredSize(new java.awt.Dimension(400, 400));

        jLabelTitleName.setText("Title Name");

        jLabelTitleYear.setText("Title Year");
        //jcombobox to select the type of media type
        jComboBoxMediaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Music", "Movie", "Box Set", "Live Concert Videos" }));
        jComboBoxMediaBox.getSelectedIndex();
        
        jLabelTitleType.setText("Title Type");
        
        jSpinner.setModel(new javax.swing.SpinnerNumberModel(2019, null, null, 1));
     
        jButtonAddTitle.setText("Add Title");
        jButtonAddTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTitleActionPerformed(evt);
            }
        });

        jLabelAddaNewTitle.setText("Add a New Title");

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

        jMenuItemAddaNewTitle.setText("Add New Title");
        jMenuItemAddaNewTitle.setToolTipText("");
        jMenuItemAddaNewTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddaNewTitleActionPerformed(evt);
            }
        });
        
        jMenuTitle.add(jMenuItemAddaNewTitle);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitleName)
                            .addComponent(jComboBoxMediaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTitleType)
                            .addComponent(jTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitleYear)
                                .addGap(245, 245, 245)
                                .addComponent(jButtonAddTitle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabelAddaNewTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelAddaNewTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitleType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMediaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitleName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabelTitleYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddTitle)
                .addContainerGap(32, Short.MAX_VALUE))
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
    private void jMenuItemAddaNewTitleActionPerformed(java.awt.event.ActionEvent evt) {  
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
    
    public String getjComboBox() {
    	//get jcombobox selection
  		return (String) jComboBoxMediaBox.getSelectedItem();
  	}
    
    public String getjTextField() {
    	//get text jTextField
		return jTextField.getText();
	}
    
    public int jSpinner() {
    	//get jSpinner Value
  		return (int) jSpinner.getValue();
  	}
 
    private void jButtonAddTitleActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	// button add the title to the database
    	Media tl = new Media(null, 10); //new title

    	String Media = this.getjComboBox(); //get media type
    	String titleName = this.getjTextField(); //get title name
    	
    	tl.setTitleName(titleName); //set title name
    	tl.setTitleYear((int) this.jSpinner.getValue()); //get title year
    	
    	//if (type of media) set enum for the Media Type
    	if(Media.equals("Music")) {
    		tl.setMediaType(MediaTypes.CD); 
    	}
    	else if(Media.equals("Movie")) {
    		tl.setMediaType(MediaTypes.DVD);
    	}
    	else if(Media.equals("Box Set")) {
    		tl.setMediaType(MediaTypes.BOXSET);
    	}
    	else if(Media.equals("Live Concert Videos")) {
    		tl.setMediaType(MediaTypes.LIVECONCERT);
    	}



    	UltraVisionDataBaseConnection db = new UltraVisionDataBaseConnection(); //new connection database

    	db.insert(tl.toString()); //toString query to the database
    	db.closingAll(); //close connection

    	JOptionPane.showMessageDialog(this, "Title added with success"); //displays success to the user
    }  

}



