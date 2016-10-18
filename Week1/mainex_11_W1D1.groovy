int counter = 1
int rank1 = getRank(counter)
int suit1 = getSuit(counter)
counter++
int rank2 = getRank(counter)
int suit2 = getSuit(counter)
counter++
int rank3 = getRank(counter)
int suit3 = getSuit(counter)
counter++
int rank4 = getRank(counter)
int suit4 = getSuit(counter)
counter++
int rank5 = getRank(counter)
int suit5 = getSuit(counter)

boolean done = false
boolean sf = false, poker = false, fh = false, flush = false, straight = false, tok = false, tp = false, pair = false, nothing = false

while (!done){
	checkSameSuit(suit1, suit2, suit3, suit4, suit5)
	checkSameRank(rank1, rank2, rank3, rank4, rank5)

}

boolean checkConsecutive(int n1, int n2, int n3, int n4, int n5){
	// write code to check
	return false // for now return false so we can check the rest of the code
}



int getRank(int counter){
	boolean valid = false
	int rank = 0
	while (!valid){
		print " Enter " + counter + " rank: "
		String str = System.console().readLine()
		if (str=="J"){
			rank=11
			valid = true
			} else if (str=="Q"){
				rank=12
				valid = true
				} else if (str=="K"){ 
					rank=13
					valid = true
				} else {
					rank = Integer.parseInt(str)
					if (rank>0 && rank<=10){
						valid = true
					} else{
						println "      Invalid option for Rank. Pleae try again!"
					}
				}
	}
	return rank
}

int getSuit(int counter){
	boolean valid = false
	while (!valid){
		print " Enter " + counter + " suit: "
		String str = System.console().readLine()
		switch (str) {
			case "spades":
				return 1
			case "hearts":
				return 2
			case "diamonds":
				return 3
			case "clubs":
				return 4
			default:
				println "      Invalid option for Rank. Pleae try again! "
		}
	}
}