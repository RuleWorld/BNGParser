// $ANTLR 3.3 Nov 30, 2010 12:50:56 BNGGrammar_SeedSpecies.g 2012-03-26 20:21:13

  package bngparser.grammars;
  import org.antlr.stringtemplate.*;
  import bngparser.dataType.BondList;
  import java.util.Map;
  import bngparser.methods.ReactionAction;
  import bngparser.dataType.Register;
  import bngparser.methods.InvertBidirectional;
  import bngparser.dataType.ChangeableChannelTokenStream;
  import bngparser.dataType.ReactionRegister;
  import bngparser.methods.GenericMethods;
  import bngparser.exceptions.VariableNotFoundException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class BNGGrammar_BNGGrammar_SeedSpecies extends Parser {
    public static final int EOF=-1;
    public static final int LINE_COMMENT=4;
    public static final int WS=5;
    public static final int VERSION=6;
    public static final int END=7;
    public static final int BEGIN=8;
    public static final int SEED=9;
    public static final int SPECIES=10;
    public static final int GROUPS=11;
    public static final int MOLECULE=12;
    public static final int MOLECULES=13;
    public static final int MODEL=14;
    public static final int TYPES=15;
    public static final int REACTION=16;
    public static final int REACTIONS=17;
    public static final int RULES=18;
    public static final int FUNCTIONS=19;
    public static final int COMPARTMENTS=20;
    public static final int ACTIONS=21;
    public static final int OBSERVABLES=22;
    public static final int SET_OPTION=23;
    public static final int SPECIES_LABEL=24;
    public static final int GENERATE_NETWORK=25;
    public static final int MAX_AGG=26;
    public static final int MAX_ITER=27;
    public static final int MAX_STOICH=28;
    public static final int OVERWRITE=29;
    public static final int PRINT_ITER=30;
    public static final int AND=31;
    public static final int OR=32;
    public static final int ID=33;
    public static final int IF=34;
    public static final int PREFFIX=35;
    public static final int SUFFIX=36;
    public static final int LABEL=37;
    public static final int PARAMETERS=38;
    public static final int VERBOSE=39;
    public static final int MATCHONCE=40;
    public static final int DELETEMOLECULES=41;
    public static final int MOVECONNECTED=42;
    public static final int AUTO=43;
    public static final int HNAUTY=44;
    public static final int QUASY=45;
    public static final int NOT=46;
    public static final int INCLUDE_REACTANTS=47;
    public static final int INCLUDE_PRODUCTS=48;
    public static final int EXCLUDE_REACTANTS=49;
    public static final int EXCLUDE_PRODUCTS=50;
    public static final int ATOL=51;
    public static final int RTOL=52;
    public static final int STEADY_STATE=53;
    public static final int SPARSE=54;
    public static final int T_END=55;
    public static final int T_START=56;
    public static final int N_STEPS=57;
    public static final int SAMPLE_TIMES=58;
    public static final int SIMULATE_ODE=59;
    public static final int SIMULATE_SSA=60;
    public static final int READFILE=61;
    public static final int FILE=62;
    public static final int WRITENET=63;
    public static final int WRITESBML=64;
    public static final int WRITEMFILE=65;
    public static final int WRITEXML=66;
    public static final int SETCONCENTRATION=67;
    public static final int SETPARAMETER=68;
    public static final int SAVECONCENTRATIONS=69;
    public static final int RESETCONCENTRATIONS=70;
    public static final int GENERATENETWORK=71;
    public static final int SUBSTANCEUNITS=72;
    public static final int SAT=73;
    public static final int DIGIT=74;
    public static final int EXPONENT=75;
    public static final int FLOAT=76;
    public static final int INT=77;
    public static final int LETTER=78;
    public static final int STRING=79;
    public static final int SEMI=80;
    public static final int COLON=81;
    public static final int LSBRACKET=82;
    public static final int RSBRACKET=83;
    public static final int LBRACKET=84;
    public static final int RBRACKET=85;
    public static final int COMMA=86;
    public static final int DOT=87;
    public static final int LPAREN=88;
    public static final int RPAREN=89;
    public static final int UNI_REACTION_SIGN=90;
    public static final int BI_REACTION_SIGN=91;
    public static final int DOLLAR=92;
    public static final int TILDE=93;
    public static final int AT=94;
    public static final int GTE=95;
    public static final int GT=96;
    public static final int LTE=97;
    public static final int LT=98;
    public static final int ASSIGNS=99;
    public static final int EQUALS=100;
    public static final int BECOMES=101;
    public static final int DIV=102;
    public static final int TIMES=103;
    public static final int MINUS=104;
    public static final int PLUS=105;
    public static final int POWER=106;
    public static final int MOD=107;
    public static final int QMARK=108;
    public static final int EMARK=109;
    public static final int DBQUOTES=110;
    public static final int AMPERSAND=111;
    public static final int NULL=112;
    public static final int LOWER=113;
    public static final int UPPER=114;
    public static final int VERSION_NUMBER=115;

    // delegates
    // delegators
    public BNGGrammar gBNGGrammar;
    public BNGGrammar gParent;


        public BNGGrammar_BNGGrammar_SeedSpecies(TokenStream input, BNGGrammar gBNGGrammar) {
            this(input, new RecognizerSharedState(), gBNGGrammar);
        }
        public BNGGrammar_BNGGrammar_SeedSpecies(TokenStream input, RecognizerSharedState state, BNGGrammar gBNGGrammar) {
            super(input, state);
            this.gBNGGrammar = gBNGGrammar;
             
            gParent = gBNGGrammar;
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("BNGGrammar_BNGGrammar_SeedSpeciesTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return BNGGrammar.tokenNames; }
    public String getGrammarFileName() { return "BNGGrammar_SeedSpecies.g"; }


     public void getParentTemplate(){
     
      this.setTemplateLib(gParent.getTemplateLib());
     }


    protected static class seed_species_block_scope {
        int numSpecies;
    }
    protected Stack seed_species_block_stack = new Stack();

    public static class seed_species_block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "seed_species_block"
    // BNGGrammar_SeedSpecies.g:15:1: seed_species_block[List seedSpecies] : BEGIN ( SEED )? SPECIES ( seed_species_def[$seed_species_block::numSpecies] )* END ( SEED )? SPECIES ;
    public final BNGGrammar_BNGGrammar_SeedSpecies.seed_species_block_return seed_species_block(List seedSpecies) throws RecognitionException {
        seed_species_block_stack.push(new seed_species_block_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.seed_species_block_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.seed_species_block_return();
        retval.start = input.LT(1);

        BNGGrammar_BNGGrammar_SeedSpecies.seed_species_def_return seed_species_def1 = null;



         ((seed_species_block_scope)seed_species_block_stack.peek()).numSpecies = 1;
           gParent.paraphrases.push("in seed species section");
           getParentTemplate();

        try {
            // BNGGrammar_SeedSpecies.g:27:1: ( BEGIN ( SEED )? SPECIES ( seed_species_def[$seed_species_block::numSpecies] )* END ( SEED )? SPECIES )
            // BNGGrammar_SeedSpecies.g:27:3: BEGIN ( SEED )? SPECIES ( seed_species_def[$seed_species_block::numSpecies] )* END ( SEED )? SPECIES
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_seed_species_block53); 
            // BNGGrammar_SeedSpecies.g:27:9: ( SEED )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEED) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:27:10: SEED
                    {
                    match(input,SEED,FOLLOW_SEED_in_seed_species_block56); 

                    }
                    break;

            }

            match(input,SPECIES,FOLLOW_SPECIES_in_seed_species_block60); 
            // BNGGrammar_SeedSpecies.g:28:1: ( seed_species_def[$seed_species_block::numSpecies] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INT||LA2_0==STRING||LA2_0==DOLLAR||LA2_0==AT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // BNGGrammar_SeedSpecies.g:28:2: seed_species_def[$seed_species_block::numSpecies]
            	    {
            	    pushFollow(FOLLOW_seed_species_def_in_seed_species_block64);
            	    seed_species_def1=seed_species_def(((seed_species_block_scope)seed_species_block_stack.peek()).numSpecies);

            	    state._fsp--;


            	                                          seedSpecies.add((seed_species_def1!=null?seed_species_def1.st:null)); 
            	                                          ((seed_species_block_scope)seed_species_block_stack.peek()).numSpecies++;
            	                                          

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_seed_species_block71); 
            // BNGGrammar_SeedSpecies.g:32:5: ( SEED )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEED) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:32:6: SEED
                    {
                    match(input,SEED,FOLLOW_SEED_in_seed_species_block74); 

                    }
                    break;

            }

            match(input,SPECIES,FOLLOW_SPECIES_in_seed_species_block78); 

            }

            retval.stop = input.LT(-1);


              gParent.paraphrases.pop();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            seed_species_block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "seed_species_block"

    protected static class seed_species_def_scope {
        List molecules;
        BondList bonds;
    }
    protected Stack seed_species_def_stack = new Stack();

    public static class seed_species_def_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "seed_species_def"
    // BNGGrammar_SeedSpecies.g:34:1: seed_species_def[int counter] : ( STRING COLON )? pre_species_def[$seed_species_def::molecules,$seed_species_def::bonds,counter] WS expression[gParent.memory] -> seed_species_block(id=\"S\" + counterconcentration=$expression.textname=$pre_species_def.textmolecules=$seed_species_def::moleculesfirstBonds=$seed_species_def::bonds.getLeft()secondBonds=$seed_species_def::bonds.getRight());
    public final BNGGrammar_BNGGrammar_SeedSpecies.seed_species_def_return seed_species_def(int counter) throws RecognitionException {
        seed_species_def_stack.push(new seed_species_def_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.seed_species_def_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.seed_species_def_return();
        retval.start = input.LT(1);

        BNGGrammar_BNGGrammar_Expression.expression_return expression2 = null;

        BNGGrammar_BNGGrammar_SeedSpecies.pre_species_def_return pre_species_def3 = null;



          ((seed_species_def_scope)seed_species_def_stack.peek()).molecules = new ArrayList();
          ((seed_species_def_scope)seed_species_def_stack.peek()).bonds = new BondList();

        try {
            // BNGGrammar_SeedSpecies.g:44:1: ( ( STRING COLON )? pre_species_def[$seed_species_def::molecules,$seed_species_def::bonds,counter] WS expression[gParent.memory] -> seed_species_block(id=\"S\" + counterconcentration=$expression.textname=$pre_species_def.textmolecules=$seed_species_def::moleculesfirstBonds=$seed_species_def::bonds.getLeft()secondBonds=$seed_species_def::bonds.getRight()))
            // BNGGrammar_SeedSpecies.g:45:1: ( STRING COLON )? pre_species_def[$seed_species_def::molecules,$seed_species_def::bonds,counter] WS expression[gParent.memory]
            {
            // BNGGrammar_SeedSpecies.g:45:1: ( STRING COLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==COLON) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:45:2: STRING COLON
                    {
                    match(input,STRING,FOLLOW_STRING_in_seed_species_def96); 
                    match(input,COLON,FOLLOW_COLON_in_seed_species_def98); 

                    }
                    break;

            }

            pushFollow(FOLLOW_pre_species_def_in_seed_species_def102);
            pre_species_def3=pre_species_def(((seed_species_def_scope)seed_species_def_stack.peek()).molecules, ((seed_species_def_scope)seed_species_def_stack.peek()).bonds, counter);

            state._fsp--;


             //There needs to need a space between species and the expression token, so we go back and make sure there was one
            ((ChangeableChannelTokenStream)input).seek(((ChangeableChannelTokenStream)input).index()-1)  ;

            match(input,WS,FOLLOW_WS_in_seed_species_def114); 
            pushFollow(FOLLOW_expression_in_seed_species_def122);
            expression2=gBNGGrammar.expression(gParent.memory);

            state._fsp--;



            // TEMPLATE REWRITE
            // 50:33: -> seed_species_block(id=\"S\" + counterconcentration=$expression.textname=$pre_species_def.textmolecules=$seed_species_def::moleculesfirstBonds=$seed_species_def::bonds.getLeft()secondBonds=$seed_species_def::bonds.getRight())
            {
                retval.st = templateLib.getInstanceOf("seed_species_block",
              new STAttrMap().put("id", "S" + counter).put("concentration", (expression2!=null?input.toString(expression2.start,expression2.stop):null)).put("name", (pre_species_def3!=null?input.toString(pre_species_def3.start,pre_species_def3.stop):null)).put("molecules", ((seed_species_def_scope)seed_species_def_stack.peek()).molecules).put("firstBonds", ((seed_species_def_scope)seed_species_def_stack.peek()).bonds.getLeft()).put("secondBonds", ((seed_species_def_scope)seed_species_def_stack.peek()).bonds.getRight()));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            seed_species_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "seed_species_def"

    protected static class pre_species_def_scope {
        boolean constant;
    }
    protected Stack pre_species_def_stack = new Stack();

    public static class pre_species_def_return extends ParserRuleReturnScope {
        public String compartment;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pre_species_def"
    // BNGGrammar_SeedSpecies.g:55:1: pre_species_def[List molecules,BondList bonds, int speciesCounter] returns [String compartment] : ({...}? INT | ) species_def[molecules,bonds,\"S\" + speciesCounter] ;
    public final BNGGrammar_BNGGrammar_SeedSpecies.pre_species_def_return pre_species_def(List molecules, BondList bonds, int speciesCounter) throws RecognitionException {
        pre_species_def_stack.push(new pre_species_def_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.pre_species_def_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.pre_species_def_return();
        retval.start = input.LT(1);

        BNGGrammar_BNGGrammar_SeedSpecies.species_def_return species_def4 = null;


        try {
            // BNGGrammar_SeedSpecies.g:61:1: ( ({...}? INT | ) species_def[molecules,bonds,\"S\" + speciesCounter] )
            // BNGGrammar_SeedSpecies.g:63:1: ({...}? INT | ) species_def[molecules,bonds,\"S\" + speciesCounter]
            {
            // BNGGrammar_SeedSpecies.g:63:1: ({...}? INT | )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==STRING||LA5_0==DOLLAR||LA5_0==AT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:63:2: {...}? INT
                    {
                    if ( !((gParent.netGrammar)) ) {
                        throw new FailedPredicateException(input, "pre_species_def", "gParent.netGrammar");
                    }
                    match(input,INT,FOLLOW_INT_in_pre_species_def186); 

                    }
                    break;
                case 2 :
                    // BNGGrammar_SeedSpecies.g:63:30: 
                    {
                    }
                    break;

            }

            pushFollow(FOLLOW_species_def_in_pre_species_def193);
            species_def4=species_def(molecules, bonds, "S" + speciesCounter);

            state._fsp--;


                ((pre_species_def_scope)pre_species_def_stack.peek()).constant = (species_def4!=null?species_def4.constant:false);
             

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            pre_species_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "pre_species_def"

    protected static class species_def_scope {
        int numMolecules;
        String variableName;
    }
    protected Stack species_def_stack = new Stack();

    public static class species_def_return extends ParserRuleReturnScope {
        public Map<String,List<ReactionRegister>> listOfMolecules;
        public boolean constant;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "species_def"
    // BNGGrammar_SeedSpecies.g:76:1: species_def[List molecules,BondList bonds,String speciesCounter] returns [Map<String,List<ReactionRegister>> listOfMolecules, boolean constant] : ( AT scomp= STRING COLON ({...}? COLON | ) )? ( DOLLAR )? (s1= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )* ) -> molecules_def(id=$species_def::variableName);
    public final BNGGrammar_BNGGrammar_SeedSpecies.species_def_return species_def(List molecules, BondList bonds, String speciesCounter) throws RecognitionException {
        species_def_stack.push(new species_def_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.species_def_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.species_def_return();
        retval.start = input.LT(1);

        Token scomp=null;
        BNGGrammar_BNGGrammar_SeedSpecies.species_element_return s1 = null;

        BNGGrammar_BNGGrammar_SeedSpecies.species_element_return s2 = null;



          ((species_def_scope)species_def_stack.peek()).numMolecules =1;
          retval.listOfMolecules = new HashMap<String,List<ReactionRegister>>();
           //We cannot have spaces between the elements of a species definition, so we activate space recognition. Should there be a space
           //the parser will not continue with this rule
         //  ((ChangeableChannelTokenStream)input).setChannel(Token.DEFAULT_CHANNEL|HIDDEN);
          ((species_def_scope)species_def_stack.peek()).variableName = "";
          retval.constant = false;
         

        try {
            // BNGGrammar_SeedSpecies.g:93:1: ( ( AT scomp= STRING COLON ({...}? COLON | ) )? ( DOLLAR )? (s1= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )* ) -> molecules_def(id=$species_def::variableName))
            // BNGGrammar_SeedSpecies.g:94:4: ( AT scomp= STRING COLON ({...}? COLON | ) )? ( DOLLAR )? (s1= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )* )
            {
            // BNGGrammar_SeedSpecies.g:94:4: ( AT scomp= STRING COLON ({...}? COLON | ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:94:5: AT scomp= STRING COLON ({...}? COLON | )
                    {
                    match(input,AT,FOLLOW_AT_in_species_def237); 
                    scomp=(Token)match(input,STRING,FOLLOW_STRING_in_species_def241); 
                    match(input,COLON,FOLLOW_COLON_in_species_def243); 
                    // BNGGrammar_SeedSpecies.g:94:27: ({...}? COLON | )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COLON) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==STRING||LA6_0==DOLLAR) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // BNGGrammar_SeedSpecies.g:94:28: {...}? COLON
                            {
                            if ( !((gParent.netGrammar)) ) {
                                throw new FailedPredicateException(input, "species_def", "gParent.netGrammar");
                            }
                            match(input,COLON,FOLLOW_COLON_in_species_def248); 

                            }
                            break;
                        case 2 :
                            // BNGGrammar_SeedSpecies.g:94:58: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }

            // BNGGrammar_SeedSpecies.g:94:63: ( DOLLAR )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DOLLAR) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:94:64: DOLLAR
                    {
                    match(input,DOLLAR,FOLLOW_DOLLAR_in_species_def258); 
                    retval.constant = true;

                    }
                    break;

            }

            // BNGGrammar_SeedSpecies.g:96:4: (s1= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )* )
            // BNGGrammar_SeedSpecies.g:96:5: s1= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )*
            {
            pushFollow(FOLLOW_species_element_in_species_def274);
            s1=species_element(bonds, speciesCounter + "_M" + ((species_def_scope)species_def_stack.peek()).numMolecules, (scomp!=null?scomp.getText():null));

            state._fsp--;


                molecules.add(s1.st);
                ((species_def_scope)species_def_stack.peek()).numMolecules++;
                ReactionRegister.addElement(retval.listOfMolecules,(s1!=null?s1.name:null),(s1!=null?s1.information:null));
                ((species_def_scope)species_def_stack.peek()).variableName += (s1!=null?input.toString(s1.start,s1.stop):null);
               
            // BNGGrammar_SeedSpecies.g:103:3: ( DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DOT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // BNGGrammar_SeedSpecies.g:103:4: DOT s2= species_element[bonds,speciesCounter + \"_M\" + $species_def::numMolecules,$scomp.text]
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_species_def286); 
            	    pushFollow(FOLLOW_species_element_in_species_def290);
            	    s2=species_element(bonds, speciesCounter + "_M" + ((species_def_scope)species_def_stack.peek()).numMolecules, (scomp!=null?scomp.getText():null));

            	    state._fsp--;

            	    molecules.add(s2.st);
            	            ((species_def_scope)species_def_stack.peek()).numMolecules++;
            	             ((species_def_scope)species_def_stack.peek()).variableName += "."+ (s2!=null?input.toString(s2.start,s2.stop):null);
            	            

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


               //We are done with space recognition so we turn it off and get the next token that is not a space
              // ((ChangeableChannelTokenStream)input).setChannel(Token.DEFAULT_CHANNEL);
              // ((ChangeableChannelTokenStream)input).seek(((ChangeableChannelTokenStream)input).skipOffTokenChannels(((ChangeableChannelTokenStream)input).index()));
             
               

            }


                //if(!gParent.variableName.contains(((species_def_scope)species_def_stack.peek()).variableName) && gParent.conserveNewMolecules){
                  //gParent.variableName.add(((species_def_scope)species_def_stack.peek()).variableName);
                 // gParent.molecules.add(new StringTemplate(((species_def_scope)species_def_stack.peek()).variableName));
                 // }
                


            // TEMPLATE REWRITE
            // 123:4: -> molecules_def(id=$species_def::variableName)
            {
                retval.st = templateLib.getInstanceOf("molecules_def",
              new STAttrMap().put("id", ((species_def_scope)species_def_stack.peek()).variableName));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            species_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "species_def"

    protected static class species_element_scope {
        List sites;
        String lcompartment;
        String lname;
    }
    protected Stack species_element_stack = new Stack();

    public static class species_element_return extends ParserRuleReturnScope {
        public String myLabel;
        public String name;
        public ReactionRegister information;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "species_element"
    // BNGGrammar_SeedSpecies.g:130:1: species_element[BondList bonds,String upperID,String compartment] returns [String myLabel,String name, ReactionRegister information] : s1= STRING ( label )? ( LPAREN site_list[$species_element::sites,bonds,upperID] RPAREN )? ( AT s2= STRING )? -> list_molecule_def(id=upperIDname=$s1.textsites=$species_element::sitescompartment=$species_element::lcompartment);
    public final BNGGrammar_BNGGrammar_SeedSpecies.species_element_return species_element(BondList bonds, String upperID, String compartment) throws RecognitionException {
        species_element_stack.push(new species_element_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.species_element_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.species_element_return();
        retval.start = input.LT(1);

        Token s1=null;
        Token s2=null;
        BNGGrammar.label_return label5 = null;



        getParentTemplate();
          ((species_element_scope)species_element_stack.peek()).sites = new ArrayList();
          ((species_element_scope)species_element_stack.peek()).lcompartment = compartment;
          retval.information = new ReactionRegister();
          retval.information.setNumBonds(bonds.getNumBonds());
          retval.information.setCompartment(compartment);
          

        try {
            // BNGGrammar_SeedSpecies.g:149:1: (s1= STRING ( label )? ( LPAREN site_list[$species_element::sites,bonds,upperID] RPAREN )? ( AT s2= STRING )? -> list_molecule_def(id=upperIDname=$s1.textsites=$species_element::sitescompartment=$species_element::lcompartment))
            // BNGGrammar_SeedSpecies.g:150:3: s1= STRING ( label )? ( LPAREN site_list[$species_element::sites,bonds,upperID] RPAREN )? ( AT s2= STRING )?
            {
            s1=(Token)match(input,STRING,FOLLOW_STRING_in_species_element394); 
            retval.name = (s1!=null?s1.getText():null);((species_element_scope)species_element_stack.peek()).lname =(s1!=null?s1.getText():null);
            // BNGGrammar_SeedSpecies.g:150:67: ( label )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==MOD) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:150:68: label
                    {
                    pushFollow(FOLLOW_label_in_species_element399);
                    label5=gBNGGrammar.label();

                    state._fsp--;

                    retval.myLabel = (label5!=null?input.toString(label5.start,label5.stop):null);

                    }
                    break;

            }

            // BNGGrammar_SeedSpecies.g:150:102: ( LPAREN site_list[$species_element::sites,bonds,upperID] RPAREN )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:150:103: LPAREN site_list[$species_element::sites,bonds,upperID] RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_species_element406); 
                    pushFollow(FOLLOW_site_list_in_species_element408);
                    site_list(((species_element_scope)species_element_stack.peek()).sites, bonds, upperID);

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_species_element411); 

                    }
                    break;

            }

            // BNGGrammar_SeedSpecies.g:151:3: ( AT s2= STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==AT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:151:4: AT s2= STRING
                    {
                    match(input,AT,FOLLOW_AT_in_species_element418); 
                    s2=(Token)match(input,STRING,FOLLOW_STRING_in_species_element422); 

                        ((species_element_scope)species_element_stack.peek()).lcompartment = (s2!=null?s2.getText():null); 
                        retval.information.setCompartment((s2!=null?s2.getText():null));
                        retval.information.setBondList(bonds);
                      

                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 157:3: -> list_molecule_def(id=upperIDname=$s1.textsites=$species_element::sitescompartment=$species_element::lcompartment)
            {
                retval.st = templateLib.getInstanceOf("list_molecule_def",
              new STAttrMap().put("id", upperID).put("name", (s1!=null?s1.getText():null)).put("sites", ((species_element_scope)species_element_stack.peek()).sites).put("compartment", ((species_element_scope)species_element_stack.peek()).lcompartment));
            }


            }

            retval.stop = input.LT(-1);


              retval.information.setNumBonds(bonds.getNumBonds()-retval.information.getNumBonds());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            species_element_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "species_element"

    protected static class site_list_scope {
        int numSites;
    }
    protected Stack site_list_stack = new Stack();

    public static class site_list_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "site_list"
    // BNGGrammar_SeedSpecies.g:159:1: site_list[List sites,BondList bonds,String upperID] : (s1= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )* )? ;
    public final BNGGrammar_BNGGrammar_SeedSpecies.site_list_return site_list(List sites, BondList bonds, String upperID) throws RecognitionException {
        site_list_stack.push(new site_list_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.site_list_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.site_list_return();
        retval.start = input.LT(1);

        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_return s1 = null;

        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_return s2 = null;



          ((site_list_scope)site_list_stack.peek()).numSites = 1;

        try {
            // BNGGrammar_SeedSpecies.g:166:1: ( (s1= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )* )? )
            // BNGGrammar_SeedSpecies.g:167:3: (s1= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )* )?
            {
            // BNGGrammar_SeedSpecies.g:167:3: (s1= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:167:4: s1= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )*
                    {
                    pushFollow(FOLLOW_site_obs_in_site_list478);
                    s1=site_obs(bonds, upperID+"_C" + ((site_list_scope)site_list_stack.peek()).numSites);

                    state._fsp--;

                    sites.add(s1.st);((site_list_scope)site_list_stack.peek()).numSites++;
                    // BNGGrammar_SeedSpecies.g:168:3: ( COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites] )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // BNGGrammar_SeedSpecies.g:168:4: COMMA s2= site_obs[bonds,upperID+\"_C\" + $site_list::numSites]
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_site_list487); 
                    	    pushFollow(FOLLOW_site_obs_in_site_list491);
                    	    s2=site_obs(bonds, upperID+"_C" + ((site_list_scope)site_list_stack.peek()).numSites);

                    	    state._fsp--;

                    	    sites.add(s2.st);((site_list_scope)site_list_stack.peek()).numSites++;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            site_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "site_list"

    protected static class site_obs_scope {
        String defaultState;
        String bondIndicator;
    }
    protected Stack site_obs_stack = new Stack();

    public static class site_obs_return extends ParserRuleReturnScope {
        public String myLabel;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "site_obs"
    // BNGGrammar_SeedSpecies.g:172:1: site_obs[BondList bonds,String upperID] returns [String myLabel] : s1= STRING ( ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? ) | site_obs_state sos2= site_obs_site[bonds,upperID] ) ( label )? -> component_def(id=upperIDname=$s1.textstate=$site_obs::defaultStatenumberOfBonds=$site_obs::bondIndicator);
    public final BNGGrammar_BNGGrammar_SeedSpecies.site_obs_return site_obs(BondList bonds, String upperID) throws RecognitionException {
        site_obs_stack.push(new site_obs_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.site_obs_return();
        retval.start = input.LT(1);

        Token s1=null;
        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_site_return sos = null;

        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_site_return sos2 = null;

        BNGGrammar.label_return label6 = null;



          ((site_obs_scope)site_obs_stack.peek()).defaultState = null;
          ((site_obs_scope)site_obs_stack.peek()).bondIndicator = "0";
          
        try {
            // BNGGrammar_SeedSpecies.g:182:1: (s1= STRING ( ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? ) | site_obs_state sos2= site_obs_site[bonds,upperID] ) ( label )? -> component_def(id=upperIDname=$s1.textstate=$site_obs::defaultStatenumberOfBonds=$site_obs::bondIndicator))
            // BNGGrammar_SeedSpecies.g:183:3: s1= STRING ( ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? ) | site_obs_state sos2= site_obs_site[bonds,upperID] ) ( label )?
            {
            s1=(Token)match(input,STRING,FOLLOW_STRING_in_site_obs530); 
            // BNGGrammar_SeedSpecies.g:184:3: ( ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? ) | site_obs_state sos2= site_obs_site[bonds,upperID] )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:185:3: ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? )
                    {
                    // BNGGrammar_SeedSpecies.g:185:3: ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? )
                    // BNGGrammar_SeedSpecies.g:185:4: (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )?
                    {
                    // BNGGrammar_SeedSpecies.g:185:4: (sos= site_obs_site[bonds,upperID] )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==EMARK) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // BNGGrammar_SeedSpecies.g:185:5: sos= site_obs_site[bonds,upperID]
                            {
                            pushFollow(FOLLOW_site_obs_site_in_site_obs543);
                            sos=site_obs_site(bonds, upperID);

                            state._fsp--;

                            ((site_obs_scope)site_obs_stack.peek()).bondIndicator = (sos!=null?sos.bond:null);

                            }
                            break;

                    }

                    // BNGGrammar_SeedSpecies.g:185:79: ( site_obs_state )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==TILDE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // BNGGrammar_SeedSpecies.g:185:79: site_obs_state
                            {
                            pushFollow(FOLLOW_site_obs_state_in_site_obs549);
                            site_obs_state();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // BNGGrammar_SeedSpecies.g:186:5: site_obs_state sos2= site_obs_site[bonds,upperID]
                    {
                    pushFollow(FOLLOW_site_obs_state_in_site_obs557);
                    site_obs_state();

                    state._fsp--;

                    pushFollow(FOLLOW_site_obs_site_in_site_obs561);
                    sos2=site_obs_site(bonds, upperID);

                    state._fsp--;

                    ((site_obs_scope)site_obs_stack.peek()).bondIndicator = (sos2!=null?sos2.bond:null);

                    }
                    break;

            }

            // BNGGrammar_SeedSpecies.g:188:8: ( label )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==MOD) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // BNGGrammar_SeedSpecies.g:188:9: label
                    {
                    pushFollow(FOLLOW_label_in_site_obs576);
                    label6=gBNGGrammar.label();

                    state._fsp--;

                    retval.myLabel = (label6!=null?input.toString(label6.start,label6.stop):null);

                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 189:3: -> component_def(id=upperIDname=$s1.textstate=$site_obs::defaultStatenumberOfBonds=$site_obs::bondIndicator)
            {
                retval.st = templateLib.getInstanceOf("component_def",
              new STAttrMap().put("id", upperID).put("name", (s1!=null?s1.getText():null)).put("state", ((site_obs_scope)site_obs_stack.peek()).defaultState).put("numberOfBonds", ((site_obs_scope)site_obs_stack.peek()).bondIndicator));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            site_obs_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "site_obs"

    public static class site_obs_state_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "site_obs_state"
    // BNGGrammar_SeedSpecies.g:191:1: site_obs_state : ( TILDE state_label ) ;
    public final BNGGrammar_BNGGrammar_SeedSpecies.site_obs_state_return site_obs_state() throws RecognitionException {
        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_state_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.site_obs_state_return();
        retval.start = input.LT(1);

        BNGGrammar_BNGGrammar_MoleculeDef.state_label_return state_label7 = null;


        try {
            // BNGGrammar_SeedSpecies.g:191:15: ( ( TILDE state_label ) )
            // BNGGrammar_SeedSpecies.g:191:17: ( TILDE state_label )
            {
            // BNGGrammar_SeedSpecies.g:191:17: ( TILDE state_label )
            // BNGGrammar_SeedSpecies.g:191:18: TILDE state_label
            {
            match(input,TILDE,FOLLOW_TILDE_in_site_obs_state612); 
            pushFollow(FOLLOW_state_label_in_site_obs_state614);
            state_label7=gBNGGrammar.state_label();

            state._fsp--;

            ((site_obs_scope)site_obs_stack.peek()).defaultState = (state_label7!=null?input.toString(state_label7.start,state_label7.stop):null);

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "site_obs_state"

    protected static class site_obs_site_scope {
        int acc;
        String bondIndicator;
    }
    protected Stack site_obs_site_stack = new Stack();

    public static class site_obs_site_return extends ParserRuleReturnScope {
        public String bond;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "site_obs_site"
    // BNGGrammar_SeedSpecies.g:193:1: site_obs_site[BondList bonds,String upperID] returns [String bond] : ( EMARK ( ( PLUS ) | ( QMARK ) | s1= bond_name ) )+ ;
    public final BNGGrammar_BNGGrammar_SeedSpecies.site_obs_site_return site_obs_site(BondList bonds, String upperID) throws RecognitionException {
        site_obs_site_stack.push(new site_obs_site_scope());
        BNGGrammar_BNGGrammar_SeedSpecies.site_obs_site_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.site_obs_site_return();
        retval.start = input.LT(1);

        Token PLUS8=null;
        Token QMARK9=null;
        BNGGrammar_BNGGrammar_SeedSpecies.bond_name_return s1 = null;



          ((site_obs_site_scope)site_obs_site_stack.peek()).acc = 0;
          ((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator = "";
          
        try {
            // BNGGrammar_SeedSpecies.g:202:3: ( ( EMARK ( ( PLUS ) | ( QMARK ) | s1= bond_name ) )+ )
            // BNGGrammar_SeedSpecies.g:203:9: ( EMARK ( ( PLUS ) | ( QMARK ) | s1= bond_name ) )+
            {
            // BNGGrammar_SeedSpecies.g:203:9: ( EMARK ( ( PLUS ) | ( QMARK ) | s1= bond_name ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EMARK) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // BNGGrammar_SeedSpecies.g:203:10: EMARK ( ( PLUS ) | ( QMARK ) | s1= bond_name )
            	    {
            	    match(input,EMARK,FOLLOW_EMARK_in_site_obs_site648); 
            	    // BNGGrammar_SeedSpecies.g:203:16: ( ( PLUS ) | ( QMARK ) | s1= bond_name )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case PLUS:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case QMARK:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case INT:
            	    case STRING:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // BNGGrammar_SeedSpecies.g:203:17: ( PLUS )
            	            {
            	            // BNGGrammar_SeedSpecies.g:203:17: ( PLUS )
            	            // BNGGrammar_SeedSpecies.g:203:18: PLUS
            	            {
            	            PLUS8=(Token)match(input,PLUS,FOLLOW_PLUS_in_site_obs_site652); 
            	            ((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator += (PLUS8!=null?PLUS8.getText():null);

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // BNGGrammar_SeedSpecies.g:204:11: ( QMARK )
            	            {
            	            // BNGGrammar_SeedSpecies.g:204:11: ( QMARK )
            	            // BNGGrammar_SeedSpecies.g:204:12: QMARK
            	            {
            	            QMARK9=(Token)match(input,QMARK,FOLLOW_QMARK_in_site_obs_site668); 
            	            ((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator += (QMARK9!=null?QMARK9.getText():null);

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // BNGGrammar_SeedSpecies.g:205:11: s1= bond_name
            	            {
            	            pushFollow(FOLLOW_bond_name_in_site_obs_site685);
            	            s1=bond_name();

            	            state._fsp--;


            	                            bonds.addElement((s1!=null?input.toString(s1.start,s1.stop):null),upperID,((species_element_scope)species_element_stack.peek()).lname);  
            	                            ((site_obs_site_scope)site_obs_site_stack.peek()).acc++;
            	                            

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


                       if(((site_obs_site_scope)site_obs_site_stack.peek()).acc >0)
                        retval.bond = ((site_obs_site_scope)site_obs_site_stack.peek()).acc + ((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator;
                       else if(!((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator.equals(""))
                        retval.bond = ((site_obs_site_scope)site_obs_site_stack.peek()).bondIndicator;
                       else 
                         retval.bond = "0";
                    

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            site_obs_site_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "site_obs_site"

    public static class bond_name_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bond_name"
    // BNGGrammar_SeedSpecies.g:220:1: bond_name : ( INT | STRING );
    public final BNGGrammar_BNGGrammar_SeedSpecies.bond_name_return bond_name() throws RecognitionException {
        BNGGrammar_BNGGrammar_SeedSpecies.bond_name_return retval = new BNGGrammar_BNGGrammar_SeedSpecies.bond_name_return();
        retval.start = input.LT(1);

        try {
            // BNGGrammar_SeedSpecies.g:220:10: ( INT | STRING )
            // BNGGrammar_SeedSpecies.g:
            {
            if ( input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bond_name"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\126\1\uffff\2\115\1\uffff";
    static final String DFA17_maxS =
        "\1\155\1\uffff\1\154\1\155\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\2\uffff\1\1\3\uffff\1\2\15\uffff\1\1\1\uffff\1\1",
            "",
            "\1\3\1\uffff\1\3\34\uffff\1\3",
            "\1\3\1\uffff\1\3\6\uffff\1\1\2\uffff\1\1\21\uffff\1\1\1\3\1"+
            "\4",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "184:3: ( ( (sos= site_obs_site[bonds,upperID] )? ( site_obs_state )? ) | site_obs_state sos2= site_obs_site[bonds,upperID] )";
        }
    }
 

    public static final BitSet FOLLOW_BEGIN_in_seed_species_block53 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_SEED_in_seed_species_block56 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SPECIES_in_seed_species_block60 = new BitSet(new long[]{0x0000000000000080L,0x000000005000A000L});
    public static final BitSet FOLLOW_seed_species_def_in_seed_species_block64 = new BitSet(new long[]{0x0000000000000080L,0x000000005000A000L});
    public static final BitSet FOLLOW_END_in_seed_species_block71 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_SEED_in_seed_species_block74 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SPECIES_in_seed_species_block78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_seed_species_def96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_seed_species_def98 = new BitSet(new long[]{0x0000000000000000L,0x000000005000A000L});
    public static final BitSet FOLLOW_pre_species_def_in_seed_species_def102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_seed_species_def114 = new BitSet(new long[]{0x0000400000000000L,0x000001000100B000L});
    public static final BitSet FOLLOW_expression_in_seed_species_def122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_pre_species_def186 = new BitSet(new long[]{0x0000000000000000L,0x000000005000A000L});
    public static final BitSet FOLLOW_species_def_in_pre_species_def193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_species_def237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_STRING_in_species_def241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_in_species_def243 = new BitSet(new long[]{0x0000000000000000L,0x000000005002A000L});
    public static final BitSet FOLLOW_COLON_in_species_def248 = new BitSet(new long[]{0x0000000000000000L,0x000000005000A000L});
    public static final BitSet FOLLOW_DOLLAR_in_species_def258 = new BitSet(new long[]{0x0000000000000000L,0x000000005000A000L});
    public static final BitSet FOLLOW_species_element_in_species_def274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_DOT_in_species_def286 = new BitSet(new long[]{0x0000000000000000L,0x000000005000A000L});
    public static final BitSet FOLLOW_species_element_in_species_def290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_species_element394 = new BitSet(new long[]{0x0000000000000002L,0x0000080041000000L});
    public static final BitSet FOLLOW_label_in_species_element399 = new BitSet(new long[]{0x0000000000000002L,0x0000000041000000L});
    public static final BitSet FOLLOW_LPAREN_in_species_element406 = new BitSet(new long[]{0x0000000000000000L,0x0000000002008000L});
    public static final BitSet FOLLOW_site_list_in_species_element408 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPAREN_in_species_element411 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_AT_in_species_element418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_STRING_in_species_element422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_site_obs_in_site_list478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_in_site_list487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_site_obs_in_site_list491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_site_obs530 = new BitSet(new long[]{0x0000000000000002L,0x0000280020000000L});
    public static final BitSet FOLLOW_site_obs_site_in_site_obs543 = new BitSet(new long[]{0x0000000000000002L,0x0000080020000000L});
    public static final BitSet FOLLOW_site_obs_state_in_site_obs549 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_site_obs_state_in_site_obs557 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_site_obs_site_in_site_obs561 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_label_in_site_obs576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_site_obs_state612 = new BitSet(new long[]{0x0000000000000000L,0x000010000000A000L});
    public static final BitSet FOLLOW_state_label_in_site_obs_state614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMARK_in_site_obs_site648 = new BitSet(new long[]{0x0000000000000000L,0x000012000000A000L});
    public static final BitSet FOLLOW_PLUS_in_site_obs_site652 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_QMARK_in_site_obs_site668 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_bond_name_in_site_obs_site685 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_set_in_bond_name0 = new BitSet(new long[]{0x0000000000000002L});

}