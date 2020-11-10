import java.awt.*;
import javax.swing.*;

public class UserFrame extends JPanel {
    public UserFrame() {
        initializeUI();
    }

    public static void showFrame() {
        JPanel panel = new UserFrame();
        panel.setOpaque(true);

        JFrame frame = new JFrame("User Information");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserFrame.showFrame();
            }
        });
    }

    private void initializeUI() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel ownerPanel = new JPanel();
        ownerPanel.add(new JLabel("Owner"));

        // Add Dashboard Tab
        tabbedPane.addTab("Owner", ownerPanel);

        JPanel clientPanel = new JPanel();
        clientPanel.add(new JLabel("Client"));

        // Add Transactions Tab
        tabbedPane.addTab("Client", clientPanel);


        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 500));
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}