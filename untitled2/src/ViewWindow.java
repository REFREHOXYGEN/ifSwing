import javax.swing.*;
import java.awt.*;

public class ViewWindow {
    private static ViewWindow viewWindow;
    private JTextField textFieldIn;
    private JTextField textFieldIn1;
    private JTextField textFieldOut;
    private JButton buttOk;
    private JFrame jFrame;
    private JPanel panelMain;

    public JTextField getTextFieldIn() {
        return textFieldIn;
    }

    public JTextField getTextFieldIn1() {
        return textFieldIn1;
    }

    public JTextField getTextFieldOut() {
        return textFieldOut;
    }

    public JButton getButtOk() {
        return buttOk;
    }

    public void setTextFieldOut(String text){
        textFieldOut.setText(text);
    }

    private void ViewWindow(){ }

    public static ViewWindow getInstance(){
        if(viewWindow == null) viewWindow = new ViewWindow();
        return viewWindow;
    }

    public void initWindow(){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        textFieldIn = new JTextField();
        textFieldIn.setColumns(5);
        textFieldIn1 = new JTextField();
        textFieldIn1.setColumns(5);
        textFieldOut = new JTextField();
        textFieldOut.setColumns(16);
        buttOk = new JButton();
        buttOk.setText("OK");
        panelMain = new JPanel();
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setBounds((dimension.width-200)/2,(dimension.height-100)/2,200,100);

    }
    public void showWindow(boolean visible){
        jFrame.setVisible(visible);
    }
    public void initPnl(){
        jFrame.add(panelMain);
        panelMain.add(textFieldIn);
        panelMain.add(textFieldIn1);
        panelMain.add(buttOk);
        panelMain.add(textFieldOut);
    }

}
