/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

// Opg 2
public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double GetChangePercent() {
        if (this.currentPrice > this.previousClosingPrice) {return ((this.currentPrice - this.previousClosingPrice) / this.currentPrice) * 100;}
        else {return ((this.previousClosingPrice - this.currentPrice) / this.previousClosingPrice) * 100;}
    }

}

