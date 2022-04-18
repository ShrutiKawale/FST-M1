player1=input("Enter what player one choses")
player2=input("Enter what playes two choses")
if player1 == "Rock" and player2 == "Rock":
    print("It's a tie!")
elif player1 == "Rock" and player2 == "Paper":
    print("player2 wins!!!")
elif player1=="Rock" and player2 =="Sicissors":
    print("player1 wins!!")

elif player1=="Paper" and player2 =="Paper":
    print("Its a tie!!")
elif player1 == "Paper" and player2 == "Sicissors":
    print("player2 wins!!!")
elif player1=="Paper" and player2 =="Rock":
    print("player1 wins!!")

elif player1=="Sicissors" and player2 =="Sicissors":
    print("Its a tie!!")
elif player1 == "Sicissors" and player2 == "Paper":
    print("player1 wins!!!")
elif player1=="Sicissors" and player2 =="Rock":
    print("player2 wins!!")
else: print("Enter proper value")


