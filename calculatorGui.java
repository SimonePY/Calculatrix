import javax.swing.*;

public class calculatorGui {
    double a, b, operationResult;
    String operation;
    private JPanel calculatorArea;
    private JTextField result;
    private JButton Two;
    private JButton Clear;
    private JButton Square;
    private JButton Eight;
    private JButton Five;
    private JButton Equal;
    private JButton Nine;
    private JButton Six;
    private JButton Three;
    private JButton Zero;
    private JButton Addition;
    private JButton Exponent;
    private JButton Seven;
    private JButton Four;
    private JButton One;
    private JButton Modulo;
    private JButton Sottration;
    private JButton Moltiplication;
    private JButton Division;
    private JButton Comma;

    public calculatorGui() {
        Clear.addActionListener(e -> result.setText(""));
        Zero.addActionListener(e -> result.setText(result.getText() + Zero.getText()));
        One.addActionListener(e -> result.setText(result.getText() + One.getText()));
        Two.addActionListener(e -> result.setText(result.getText() + Two.getText()));
        Three.addActionListener(e -> result.setText(result.getText() + Three.getText()));
        Four.addActionListener(e -> result.setText(result.getText() + Four.getText()));
        Five.addActionListener(e -> result.setText(result.getText() + Five.getText()));
        Six.addActionListener(e -> result.setText(result.getText() + Six.getText()));
        Seven.addActionListener(e -> result.setText(result.getText() + Seven.getText()));
        Eight.addActionListener(e -> result.setText(result.getText() + Eight.getText()));
        Nine.addActionListener(e -> result.setText(result.getText() + Nine.getText()));
        Addition.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "+";
            result.setText("");
        });
        Sottration.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "-";
            result.setText("");
        });
        Moltiplication.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "*";
            result.setText("");
        });
        Division.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "/";
            result.setText("");
        });
        Modulo.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "%";
            result.setText("");
        });
        Exponent.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "^";
            result.setText("");
        });
        Square.addActionListener(e -> {
            a = Double.parseDouble(result.getText());
            operation = "v";
            result.setText("");
        });
        Comma.addActionListener(e -> {
            result.getText();
            {
                result.setText(result.getText() + Comma.getText());
            }
        });
        Equal.addActionListener(e -> {
            b = Double.parseDouble(result.getText());
            switch (operation) {
                case "+" -> {
                    operationResult = a + b;
                    result.setText(String.valueOf(operationResult));
                }
                case "-" -> {
                    operationResult = a - b;
                    result.setText(String.valueOf(operationResult));
                }
                case "*" -> {
                    operationResult = a * b;
                    result.setText(String.valueOf(operationResult));
                }
                case "/" -> {
                    operationResult = a / b;
                    result.setText(String.valueOf(operationResult));
                }
                case "%" -> {
                    operationResult = a % b;
                    result.setText(String.valueOf(operationResult));
                }
                case "^" -> {
                    operationResult = Math.pow(a, b);
                    result.setText(String.valueOf(operationResult));
                }
                case "v" -> {
                    operationResult = Math.sqrt(a);
                    result.setText(String.valueOf(operationResult));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorGui");
        frame.setContentPane(new calculatorGui().calculatorArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
