import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public void start(){
        ViewWindow  viewWindow = ViewWindow.getInstance();
        viewWindow.initWindow();
        viewWindow.showWindow(true);
        viewWindow.initPnl();
        viewWindow.getButtOk().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(viewWindow.getTextFieldIn().getText());
                int b = Integer.parseInt(viewWindow.getTextFieldIn1().getText());
                viewWindow.setTextFieldOut(String.valueOf(a>b?a:b));
            }
        });
    }
}
