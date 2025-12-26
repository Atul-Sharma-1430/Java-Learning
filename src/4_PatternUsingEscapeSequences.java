class PatternUsingEscapeSequences {
    public static void main(String[] args) {
        System.out.print(
                // Right Half Pyramid
                "Right Half Pyramid:\n" +
                        "* \n" +
                        "* * \n" +
                        "* * * \n" +
                        "* * * * \n" +
                        "* * * * * \n\n"
        );

        System.out.println(
                // Mirror Image Left Half Pyramid
                "Mirror Image Left Half Pyramid:\n" +
                        "        * \n" +
                        "      * * \n" +
                        "    * * * \n" +
                        "  * * * * \n" +
                        "* * * * * \n"
                );

        System.out.println(
                // Reverse Right Half Pyramid
                "Reverse Right Half Pyramid:\n" +
                        "* * * * * \n" +
                        "* * * * \n" +
                        "* * * \n" +
                        "* * \n" +
                        "* \n"
        );
    }
}
