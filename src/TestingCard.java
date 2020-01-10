public class TestingCard {
    public static void main(String[] args)
    {
        Card queenOfHearts = new Card("queen","hearts");
        Card tenOfSpades = new Card("10", "spades");
        Card threeOfDiamonds = new Card("3","diamonds");
        Card fourOfClubs = new Card("4","clubs");
        Card fiftyOfJaret = new Card("5","diamonds");

        System.out.printf("Queen of Hearts: %s value: %d%n", queenOfHearts, queenOfHearts.getFaceValue());
        System.out.printf("10 of spades: %s value: %d%n", tenOfSpades, tenOfSpades.getFaceValue());
        System.out.printf("3 of diamonds: %s value: %d%n", threeOfDiamonds, threeOfDiamonds.getFaceValue());
        System.out.printf("4 of clubs: %s value: %d%n", fourOfClubs, fourOfClubs.getFaceValue());
        System.out.printf("50 of Jaret: %s value: %d%n", fiftyOfJaret, fiftyOfJaret.getFaceValue());




    }

}
