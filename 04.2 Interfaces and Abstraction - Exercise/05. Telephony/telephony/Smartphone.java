package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            try {
                long number = Long.parseLong(this.numbers.get(i));
                builder.append("Calling... ").append(this.numbers.get(i))
                        .append(System.lineSeparator());
            } catch (NumberFormatException e) {
                builder.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }

        return builder.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();

        boolean isDigit = false;

        for (int i = 0; i < this.urls.size(); i++) {
            for (int j = 0; j < this.urls.get(i).length(); j++) {
                if (Character.isDigit(this.urls.get(i).charAt(j))) {
                    isDigit = true;
                    break;
                }
            }

            if (!isDigit) {
                builder.append("Browsing: ").append(this.urls.get(i)).append("!")
                        .append(System.lineSeparator());
            } else {
                builder.append("Invalid URL!")
                        .append(System.lineSeparator());
            }

            isDigit = false;
        }

        return builder.toString().trim();
    }
}
