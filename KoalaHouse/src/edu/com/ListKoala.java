/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com;


import edu.com.Dialog.DSChuaHoanThanhHocPhi;
import edu.com.Dialog.DSDaDongTienHoc;
import edu.com.Dialog.DSDatCoc;
import edu.com.Dialog.DSTaiKhoan;

import edu.com.Dialog.Receipts;
import edu.com.Dialog.TaoTaiKhoan;
import edu.com.Dialog.ThemSuaLop;

import edu.com.Panel.CacLoaiPhi;
import edu.com.Panel.DSHS;
import edu.com.Panel.DSLop;
import edu.com.Panel.DSNo;
import edu.com.Panel.HocSinhA;
import edu.com.Panel.LopX;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author nguyen van cuong
 */
public class ListKoala extends javax.swing.JFrame {

    /**
     * Creates new form List
     */
    public ListKoala() {
        initComponents();
        Panel_GDChinh.removeAll();
        HocSinhA a = new HocSinhA();
        Panel_GDChinh.add("Trung Tâm",Panel_trungtam);
        new CloseTabButton(Panel_GDChinh,0);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tuychon = new javax.swing.JPopupMenu();
        them = new javax.swing.JMenuItem();
        chitiet = new javax.swing.JMenuItem();
        sua = new javax.swing.JMenuItem();
        xoa = new javax.swing.JMenuItem();
        tree = new javax.swing.JPopupMenu();
        trinhdo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        A = new javax.swing.JMenuItem();
        B = new javax.swing.JMenuItem();
        C = new javax.swing.JMenuItem();
        D = new javax.swing.JMenuItem();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        Panel_GDChinh = new javax.swing.JTabbedPane();
        Panel_trungtam = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_QuanLy = new javax.swing.JMenu();
        Menu_DanhSachLop = new javax.swing.JMenuItem();
        Menu_HSDatCoc = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Menu_ThemLop = new javax.swing.JMenuItem();
        Menu_SuaLop = new javax.swing.JMenuItem();
        Menu_XoaLop = new javax.swing.JMenuItem();
        DongPhi = new javax.swing.JMenu();
        Menu_HSHoanThanh = new javax.swing.JMenuItem();
        Menu_HSChuaHoanThanh = new javax.swing.JMenuItem();
        HeThong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Menu_TaiKhoan = new javax.swing.JMenu();
        Menu_ThemTaiKhoan = new javax.swing.JMenuItem();
        Menu_SuaTaiKhoan = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Menu_Update = new javax.swing.JMenuItem();
        Menu_DangXuat = new javax.swing.JMenuItem();
        Menu_thoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Menu_DongBo = new javax.swing.JMenuItem();
        Menu_BackUp = new javax.swing.JMenuItem();

        them.setText("them");
        tuychon.add(them);

        chitiet.setText("chi tiet");
        tuychon.add(chitiet);

        sua.setText("sua");
        tuychon.add(sua);

        xoa.setText("xoa");
        tuychon.add(xoa);

        trinhdo.setText("len trinh do");
        tree.add(trinhdo);

        jMenu1.setText("jMenu1");

        A.setText("jMenuItem2");
        jMenu1.add(A);

        B.setText("jMenuItem3");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jMenu1.add(B);

        C.setText("jMenuItem4");
        jMenu1.add(C);

        D.setText("jMenuItem5");
        jMenu1.add(D);

        tree.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setOneTouchExpandable(true);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Koala House");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Koala House Bà Triệu");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NẮNG MAI (SUNSHINE)");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SUNSHINE_1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SUNSHINE_2");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SUNSHINE_3");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ ONG (BEEHIVE)");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("BEEHIVE_1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("BEEHIVE_2");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("BEEHIVE_3");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ KÉN (CHRYSALIS)");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("CHRYSALIS_1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("CHRYSALIS_2");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MẪU GIÁO (KINDERGARTEN)");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("KINDERGARTEN_1");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("KINDERGARTEN_2");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Koala House Hoàng Ngân");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NẮNG MAI (SUNSHINE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ ONG (BEEHIVE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ KÉN (CHRYSALIS)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MẪU GIÁO (KINDERGARTEN)");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Koala House Phan Kế Bính");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NẮNG MAI (SUNSHINE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ ONG (BEEHIVE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ KÉN (CHRYSALIS)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MẪU GIÁO (KINDERGARTEN)");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Koala House Nguyễn Huy Tự");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("NẮNG MAI (SUNSHINE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ ONG (BEEHIVE)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("TỔ KÉN (CHRYSALIS)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("MẪU GIÁO (KINDERGARTEN)");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setAutoscrolls(true);
        jTree1.setMinimumSize(new java.awt.Dimension(100, 80));
        jTree1.setPreferredSize(new java.awt.Dimension(300, 80));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTree1MouseReleased(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        jSplitPane2.setLeftComponent(jPanel3);

        Panel_GDChinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_GDChinh.setPreferredSize(new java.awt.Dimension(1110, 570));
        Panel_GDChinh.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Panel_GDChinhStateChanged(evt);
            }
        });

        jLabel14.setText("Anh trung tam");

        javax.swing.GroupLayout Panel_trungtamLayout = new javax.swing.GroupLayout(Panel_trungtam);
        Panel_trungtam.setLayout(Panel_trungtamLayout);
        Panel_trungtamLayout.setHorizontalGroup(
            Panel_trungtamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_trungtamLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
        Panel_trungtamLayout.setVerticalGroup(
            Panel_trungtamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_trungtamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Panel_GDChinh.addTab("Trung Tâm", Panel_trungtam);

        jScrollPane3.setViewportView(Panel_GDChinh);

        jSplitPane2.setRightComponent(jScrollPane3);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/List.jpg"))); // NOI18N
        jLabel21.setToolTipText("Danh Sách Học Sinh");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/images.jpg"))); // NOI18N
        jLabel22.setToolTipText("Danh Sách Lớp");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/Bill.png"))); // NOI18N
        jLabel24.setToolTipText("Các Loại Phí");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/DSHS.JPG"))); // NOI18N
        jLabel26.setToolTipText("Danh Sách Nợ");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/bill2.jpg"))); // NOI18N
        jLabel27.setToolTipText("Tạo Hóa Đơn");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/com/image/print.png"))); // NOI18N
        jLabel28.setToolTipText("Print");

        jLabel23.setText("DS Lớp");

        jLabel25.setText("DS HS");

        jLabel29.setText("Các Loại Phí");

        jLabel30.setText("DS Nợ");

        jLabel31.setText("Hóa Đơn");

        jLabel32.setText("Print");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel29)))
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30))
                .addGap(58, 58, 58)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31))
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32))
                .addContainerGap(836, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Menu_QuanLy.setText("Quản Lý");

        Menu_DanhSachLop.setText("Danh Sách Lớp");
        Menu_DanhSachLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DanhSachLopMouseClicked(evt);
            }
        });
        Menu_DanhSachLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_DanhSachLopActionPerformed(evt);
            }
        });
        Menu_QuanLy.add(Menu_DanhSachLop);

        Menu_HSDatCoc.setText("Danh sách học sinh giữ chỗ");
        Menu_HSDatCoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_HSDatCocActionPerformed(evt);
            }
        });
        Menu_QuanLy.add(Menu_HSDatCoc);

        jMenuBar1.add(Menu_QuanLy);

        jMenu3.setText("Quản Lý Lớp");

        Menu_ThemLop.setText("Thêm");
        Menu_ThemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ThemLopActionPerformed(evt);
            }
        });
        jMenu3.add(Menu_ThemLop);

        Menu_SuaLop.setText("Sửa");
        Menu_SuaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SuaLopActionPerformed(evt);
            }
        });
        jMenu3.add(Menu_SuaLop);

        Menu_XoaLop.setText("Xóa");
        jMenu3.add(Menu_XoaLop);

        jMenuBar1.add(jMenu3);

        DongPhi.setText("Quá trình đóng phí");
        DongPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DongPhiActionPerformed(evt);
            }
        });

        Menu_HSHoanThanh.setText("Học sinh đã hoàn thành phí học tập");
        Menu_HSHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_HSHoanThanhActionPerformed(evt);
            }
        });
        DongPhi.add(Menu_HSHoanThanh);

        Menu_HSChuaHoanThanh.setText("Học sinh chưa hoàn thành phí học tập");
        Menu_HSChuaHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_HSChuaHoanThanhActionPerformed(evt);
            }
        });
        DongPhi.add(Menu_HSChuaHoanThanh);

        jMenuBar1.add(DongPhi);

        HeThong.setText("Hệ Thống");
        HeThong.add(jSeparator1);

        Menu_TaiKhoan.setText("Tài khoản");

        Menu_ThemTaiKhoan.setText("Thêm");
        Menu_ThemTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ThemTaiKhoanActionPerformed(evt);
            }
        });
        Menu_TaiKhoan.add(Menu_ThemTaiKhoan);

        Menu_SuaTaiKhoan.setText("Sửa");
        Menu_SuaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SuaTaiKhoanActionPerformed(evt);
            }
        });
        Menu_TaiKhoan.add(Menu_SuaTaiKhoan);

        jMenuItem10.setText("Xóa");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem10MouseClicked(evt);
            }
        });
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Menu_TaiKhoan.add(jMenuItem10);

        HeThong.add(Menu_TaiKhoan);

        Menu_Update.setText("Cập nhật hệ thống");
        HeThong.add(Menu_Update);

        Menu_DangXuat.setText("Đăng Xuất");
        HeThong.add(Menu_DangXuat);

        Menu_thoat.setText("Thoát");
        HeThong.add(Menu_thoat);

        jMenuBar1.add(HeThong);

        jMenu2.setText("Dữ Liệu");

        Menu_DongBo.setText("Đồng Bộ");
        jMenu2.add(Menu_DongBo);

        Menu_BackUp.setText("Backup");
        jMenu2.add(Menu_BackUp);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            JTree node = (JTree)evt.getSource();
        TreePath path = node.getPathForLocation(evt.getX(), evt.getY());
        if(path==null){
            return;
        }
        //node.setSelectionPath(path);
        DefaultMutableTreeNode selNode=(DefaultMutableTreeNode)path.getLastPathComponent();
            JOptionPane.showMessageDialog(null, (String)selNode.getUserObject());
            tree.show(this,evt.getXOnScreen()-this.getX(),evt.getYOnScreen()-this.getY());
            
        }
    }//GEN-LAST:event_jTree1MouseReleased

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selNode=(DefaultMutableTreeNode)evt.getPath().getLastPathComponent();
	if(selNode.isLeaf()){
           LopX dslopa= new LopX(selNode.toString());
           Panel_GDChinh.add(selNode.toString(),dslopa);
           Panel_GDChinh.setSelectedComponent(dslopa);
           
            dslopa.center = Panel_GDChinh;
            new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
            
            //LopX dslopa= new LopX();
            
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void Menu_HSDatCocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_HSDatCocActionPerformed
        // TODO add your handling code here:
        DSDatCoc dSDat= new DSDatCoc(this,rootPaneCheckingEnabled);
        dSDat.setAlwaysOnTop(rootPaneCheckingEnabled);
        dSDat.setLocation(420, 130);
        dSDat.show();
    
    }//GEN-LAST:event_Menu_HSDatCocActionPerformed

    private void Panel_GDChinhStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Panel_GDChinhStateChanged

    }//GEN-LAST:event_Panel_GDChinhStateChanged

    private void Menu_DanhSachLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DanhSachLopMouseClicked
        // TODO add your handling code here:
        DSLop dslop1 = new DSLop();
        System.out.print("Đ");
        Panel_GDChinh.add("Danh Sach Lop", dslop1);
        Panel_GDChinh.setSelectedComponent(dslop1);
        new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_Menu_DanhSachLopMouseClicked

    private void Menu_DanhSachLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_DanhSachLopActionPerformed
        // TODO add your handling code here:
        DSLop dslop2 = new DSLop();
        Panel_GDChinh.add("Danh Sach Lop", dslop2);
        Panel_GDChinh.setSelectedComponent(dslop2);
        dslop2.center = Panel_GDChinh;
        new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_Menu_DanhSachLopActionPerformed

    private void Menu_ThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ThemLopActionPerformed
        // TODO add your handling code here:
        ThemSuaLop themSuaLop= new ThemSuaLop(this, rootPaneCheckingEnabled);
        themSuaLop.setLocation(420, 130);
        themSuaLop.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Menu_ThemLopActionPerformed

    private void Menu_SuaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SuaLopActionPerformed
        // TODO add your handling code here:
    ThemSuaLop themSuaLop= new ThemSuaLop(this, rootPaneCheckingEnabled);
        //themSuaLop.show();
    
        themSuaLop.setLocation(420, 130);
        themSuaLop.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Menu_SuaLopActionPerformed

    private void Menu_ThemTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ThemTaiKhoanActionPerformed
        // TODO add your handling code here:
        TaoTaiKhoan taoTaiKhoan= new TaoTaiKhoan(this,rootPaneCheckingEnabled);
        taoTaiKhoan.setLocation(420, 130);
        taoTaiKhoan.show();
    }//GEN-LAST:event_Menu_ThemTaiKhoanActionPerformed

    private void Menu_SuaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SuaTaiKhoanActionPerformed
        // TODO add your handling code here:
        TaoTaiKhoan taoTaiKhoan= new TaoTaiKhoan(this,rootPaneCheckingEnabled);
        taoTaiKhoan.setLocation(420, 130);
        taoTaiKhoan.show();
    }//GEN-LAST:event_Menu_SuaTaiKhoanActionPerformed

    private void DongPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DongPhiActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_DongPhiActionPerformed

    private void Menu_HSChuaHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_HSChuaHoanThanhActionPerformed
        // TODO add your handling code here:
        DSChuaHoanThanhHocPhi ds= new DSChuaHoanThanhHocPhi(this, rootPaneCheckingEnabled);
        ds.setAlwaysOnTop(rootPaneCheckingEnabled);
        ds.center = Panel_GDChinh;
        ds.setLocation(320, 130);
        ds.show();
    }//GEN-LAST:event_Menu_HSChuaHoanThanhActionPerformed

    private void Menu_HSHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_HSHoanThanhActionPerformed
        // TODO add your handling code here:
        DSDaDongTienHoc ds= new DSDaDongTienHoc(this, rootPaneCheckingEnabled);
        ds.setAlwaysOnTop(rootPaneCheckingEnabled);
        ds.center = Panel_GDChinh;
        ds.setLocation(320, 130);
        ds.show();
    }//GEN-LAST:event_Menu_HSHoanThanhActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        DSHS dshs = new DSHS();
        Panel_GDChinh.add("Danh Sách HS", dshs);
        Panel_GDChinh.setSelectedComponent(dshs);
        dshs.center = Panel_GDChinh;
        new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        DSLop dsl = new DSLop();
        Panel_GDChinh.add("Danh Sách Lớp",dsl);
        Panel_GDChinh.setSelectedComponent(dsl);
        dsl.center = Panel_GDChinh;
        new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        CacLoaiPhi loaiphi = new CacLoaiPhi();
        Panel_GDChinh.add("Các Loại Phí", loaiphi);
        Panel_GDChinh.setSelectedComponent(loaiphi);
        new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        DSNo dsno = new DSNo();
       Panel_GDChinh.add("Danh Sách Nợ",dsno);
       Panel_GDChinh.setSelectedComponent(dsno);
       dsno.center =Panel_GDChinh;
       new CloseTabButton(Panel_GDChinh,Panel_GDChinh.getComponentCount()-2);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        Receipts receipts= new Receipts(this, rootPaneCheckingEnabled);
        receipts.setAlwaysOnTop(rootPaneCheckingEnabled);
        receipts.setLocation(420,20);
        receipts.show();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jMenuItem10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem10MouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        DSTaiKhoan dstaikhoan= new DSTaiKhoan(this, rootPaneCheckingEnabled);
        dstaikhoan.setAlwaysOnTop(rootPaneCheckingEnabled);
        dstaikhoan.setLocation(420, 20);
        dstaikhoan.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListKoala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListKoala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListKoala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListKoala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListKoala().setVisible(true);
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem A;
    private javax.swing.JMenuItem B;
    private javax.swing.JMenuItem C;
    private javax.swing.JMenuItem D;
    private javax.swing.JMenu DongPhi;
    private javax.swing.JMenu HeThong;
    private javax.swing.JMenuItem Menu_BackUp;
    private javax.swing.JMenuItem Menu_DangXuat;
    private javax.swing.JMenuItem Menu_DanhSachLop;
    private javax.swing.JMenuItem Menu_DongBo;
    private javax.swing.JMenuItem Menu_HSChuaHoanThanh;
    private javax.swing.JMenuItem Menu_HSDatCoc;
    private javax.swing.JMenuItem Menu_HSHoanThanh;
    private javax.swing.JMenu Menu_QuanLy;
    private javax.swing.JMenuItem Menu_SuaLop;
    private javax.swing.JMenuItem Menu_SuaTaiKhoan;
    private javax.swing.JMenu Menu_TaiKhoan;
    private javax.swing.JMenuItem Menu_ThemLop;
    private javax.swing.JMenuItem Menu_ThemTaiKhoan;
    private javax.swing.JMenuItem Menu_Update;
    private javax.swing.JMenuItem Menu_XoaLop;
    private javax.swing.JMenuItem Menu_thoat;
    private javax.swing.JTabbedPane Panel_GDChinh;
    private javax.swing.JPanel Panel_trungtam;
    private javax.swing.JMenuItem chitiet;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem sua;
    private javax.swing.JMenuItem them;
    private javax.swing.JPopupMenu tree;
    private javax.swing.JMenuItem trinhdo;
    private javax.swing.JPopupMenu tuychon;
    private javax.swing.JMenuItem xoa;
    // End of variables declaration//GEN-END:variables
}
class CloseTabButton extends JPanel implements ActionListener {
  private JTabbedPane pane;
  public CloseTabButton(JTabbedPane pane, int index) {
    this.pane = pane;
    setOpaque(false);
    add(new JLabel(
        pane.getTitleAt(index),
        pane.getIconAt(index),
        JLabel.LEFT));
    Icon closeIcon = new CloseIcon();
    JButton btClose = new JButton(closeIcon);
    btClose.setPreferredSize(new Dimension(
        closeIcon.getIconWidth(), closeIcon.getIconHeight()));
    add(btClose);
    btClose.addActionListener(this);
    pane.setTabComponentAt(index, this);
  }
  public void actionPerformed(ActionEvent e) {
    int i = pane.indexOfTabComponent(this);
    if (i != -1) {
      pane.remove(i);
    }
  }
}
class CloseIcon implements Icon {
  public void paintIcon(Component c, Graphics g, int x, int y) {
    g.setColor(Color.RED);
    g.drawLine(6, 6, getIconWidth() - 7, getIconHeight() - 7);
    g.drawLine(getIconWidth() - 7, 6, 6, getIconHeight() - 7);
  }
  public int getIconWidth() {
    return 17;
  }
  public int getIconHeight() {
    return 17;
  }
}