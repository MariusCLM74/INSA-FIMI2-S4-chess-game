public class Board{
    public Piece [][] board;
    public LinkedList <Piece>;
    
    public Board(){
        
        //Initialisation du plateau 
        
        //Création des pièces
        //Blancs :
        Queen wQ = new Queen();
        King wK = new King();
        Rook wR1 = new Rook();
        Rook wR2 = new Rook();
        Bishop wB1 = new Bishop();
        Bishop wB2 = new Bishop();
        Knight wC1 = new Knight();
        Knight wC2 = new Knight();
        Pawn wP1 = new Pawn();
        Pawn wP2 = new Pawn();
        Pawn wP3 = new Pawn();
        Pawn wP4 = new Pawn();
        Pawn wP5 = new Pawn();
        Pawn wP6 = new Pawn();
        Pawn wP7 = new Pawn();
        Pawn wP8 = new Pawn();
        
        //Noirs :
        Queen bQ = new Queen();
        King bK = new King();
        Rook bR1 = new Rook();
        Rook bR2 = new Rook();
        Bishop bB1 = new Bishop();
        Bishop bB2 = new Bishop();
        Knight bC1 = new Knight();
        Knight bC2 = new Knight();
        Pawn bP1 = new Pawn();
        Pawn bP2 = new Pawn();
        Pawn bP3 = new Pawn();
        Pawn bP4 = new Pawn();
        Pawn bP5 = new Pawn();
        Pawn bP6 = new Pawn();
        Pawn bP7 = new Pawn();
        Pawn bP8 = new Pawn();
        
        Piece [][] boardMain = {
        {bR1, bB1, bC1, bQ, bK, bC2, bB2, bR2},
        {bP1, bP2, bP3, bP4, bP5, bP6, bP7, bP8},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {wP1, wP2, wP3, wP4, wP5, wP6, wP7, wP8},
        {wR1, wB1, wC1, wQ, wK, wC2, wB2, wR2},
        };
        board=boardMain;
        
    }
    
    
}
