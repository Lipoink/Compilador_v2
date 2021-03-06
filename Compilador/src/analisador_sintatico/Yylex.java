/* The following code was generated by JFlex 1.4.3 on 02/11/16 21:58 */

package analisador_sintatico;

import java_cup.runtime.Symbol;
import analisador_sintatico.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 02/11/16 21:58 from the specification file
 * <tt>F:/Compilador/src/analisador_sintatico/Regras.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 40, 40,  0,  0, 40,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    40, 32, 41,  0,  0, 28, 33, 41, 35, 36, 28, 26,  0, 27,  0, 28, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 39, 31, 29, 30,  0, 
     0, 15, 22, 14, 21, 10,  7, 23,  9,  6,  1,  1,  5, 18,  3, 17, 
    20,  1, 12, 16, 11,  4, 24,  8, 19, 13, 25,  0,  0,  0,  0,  1, 
     0, 15, 22, 14, 21, 10,  7, 23,  9,  6,  1,  1,  5, 18,  3, 17, 
    20,  1, 12, 16, 11,  4, 24,  8, 19, 13, 25, 37, 34, 38,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\14\2\3\4\1\5\2\6"+
    "\3\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\6\2\1\17\21\2\1\20\1\21\1\22\1\6\1\7"+
    "\1\0\5\2\1\23\6\2\1\24\5\2\1\25\12\2"+
    "\1\0\1\26\13\2\1\27\1\30\1\2\1\31\11\2"+
    "\1\3\11\2\1\23\1\2\1\32\3\2\1\33\30\2"+
    "\1\27\13\2\1\34\54\2\1\35\77\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[279];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372\0\u031e\0\u039c"+
    "\0\u03c6\0\u03f0\0\52\0\52\0\52\0\52\0\52\0\52"+
    "\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec\0\124\0\u0516"+
    "\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666"+
    "\0\u0690\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6"+
    "\0\52\0\52\0\52\0\52\0\52\0\u07e0\0\u080a\0\u0834"+
    "\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984"+
    "\0\u09ae\0\u09d8\0\124\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa"+
    "\0\124\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20"+
    "\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c\0\u0e46\0\u0e70"+
    "\0\124\0\124\0\u0e9a\0\124\0\u0ec4\0\u0eee\0\u0f18\0\u0f42"+
    "\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\52\0\u103e\0\u1068"+
    "\0\u1092\0\u10bc\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\124"+
    "\0\u11b8\0\124\0\u11e2\0\u120c\0\u1236\0\124\0\u1260\0\u128a"+
    "\0\u12b4\0\u12de\0\u1308\0\u1332\0\u135c\0\u1386\0\u13b0\0\u13da"+
    "\0\u1404\0\u142e\0\u1458\0\u1482\0\u14ac\0\u14d6\0\u1500\0\u152a"+
    "\0\u1554\0\u157e\0\u15a8\0\u15d2\0\u15fc\0\u1626\0\u1650\0\u167a"+
    "\0\u16a4\0\u16ce\0\u16f8\0\u1722\0\u174c\0\u1776\0\u17a0\0\u17ca"+
    "\0\u17f4\0\u181e\0\124\0\u1848\0\u1872\0\u189c\0\u18c6\0\u18f0"+
    "\0\u191a\0\u1944\0\u196e\0\u1998\0\u19c2\0\u19ec\0\u1a16\0\u1a40"+
    "\0\u1a6a\0\u1a94\0\u1abe\0\u1ae8\0\u1b12\0\u1b3c\0\u1b66\0\u1b90"+
    "\0\u1bba\0\u1be4\0\u1c0e\0\u1c38\0\u1c62\0\u1c8c\0\u1cb6\0\u1ce0"+
    "\0\u1d0a\0\u1d34\0\u1d5e\0\u1d88\0\u1db2\0\u1ddc\0\u1e06\0\u1e30"+
    "\0\u1e5a\0\u1e84\0\u1eae\0\u1ed8\0\u1f02\0\u1f2c\0\u1f56\0\124"+
    "\0\u1f80\0\u1faa\0\u1fd4\0\u1ffe\0\u2028\0\u2052\0\u207c\0\u20a6"+
    "\0\u20d0\0\u20fa\0\u2124\0\u214e\0\u2178\0\u21a2\0\u21cc\0\u21f6"+
    "\0\u2220\0\u224a\0\u2274\0\u229e\0\u22c8\0\u22f2\0\u231c\0\u2346"+
    "\0\u2370\0\u239a\0\u23c4\0\u23ee\0\u2418\0\u2442\0\u246c\0\u2496"+
    "\0\u24c0\0\u24ea\0\u2514\0\u253e\0\u2568\0\u2592\0\u25bc\0\u25e6"+
    "\0\u2610\0\u263a\0\u2664\0\u268e\0\u26b8\0\u26e2\0\u270c\0\u2736"+
    "\0\u2760\0\u278a\0\u27b4\0\u27de\0\u2808\0\u2832\0\u285c\0\u2886"+
    "\0\u28b0\0\u28da\0\u2904\0\u292e\0\u2958\0\u2982\0\u29ac";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[279];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\11\1\3\1\12\1\13\2\3\1\14\1\15\1\16"+
    "\4\3\1\17\1\20\3\3\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\53\0\31\3\22\0\1\4"+
    "\50\0\3\3\1\41\5\3\1\42\6\3\1\43\10\3"+
    "\21\0\2\3\1\44\26\3\21\0\2\3\1\45\1\3"+
    "\1\46\1\3\1\47\22\3\21\0\4\3\1\50\1\51"+
    "\10\3\1\52\1\3\1\53\10\3\21\0\10\3\1\54"+
    "\20\3\21\0\2\3\1\55\1\3\1\56\15\3\1\57"+
    "\6\3\21\0\13\3\1\60\15\3\21\0\4\3\1\61"+
    "\3\3\1\62\5\3\1\63\12\3\21\0\13\3\1\64"+
    "\15\3\21\0\11\3\1\65\1\66\16\3\21\0\20\3"+
    "\1\67\10\3\21\0\20\3\1\70\10\3\52\0\1\71"+
    "\2\0\1\72\47\0\1\71\1\0\1\72\51\0\1\72"+
    "\51\0\1\73\51\0\2\74\50\0\1\74\1\0\1\74"+
    "\53\0\1\75\52\0\1\75\42\0\1\76\17\0\4\3"+
    "\1\77\14\3\1\100\7\3\21\0\26\3\1\101\2\3"+
    "\21\0\17\3\1\102\11\3\21\0\17\3\1\103\11\3"+
    "\21\0\12\3\1\104\4\3\1\105\4\3\1\106\4\3"+
    "\21\0\4\3\1\107\24\3\21\0\20\3\1\110\10\3"+
    "\21\0\2\3\1\111\26\3\21\0\4\3\1\112\24\3"+
    "\21\0\13\3\1\113\15\3\21\0\5\3\1\114\23\3"+
    "\21\0\3\3\1\115\25\3\21\0\17\3\1\116\11\3"+
    "\21\0\15\3\1\117\13\3\21\0\3\3\1\120\10\3"+
    "\1\121\14\3\21\0\16\3\1\122\1\3\1\123\10\3"+
    "\21\0\16\3\1\124\12\3\21\0\12\3\1\125\16\3"+
    "\21\0\5\3\1\126\5\3\1\127\15\3\21\0\15\3"+
    "\1\130\13\3\21\0\13\3\1\131\15\3\21\0\3\3"+
    "\1\132\25\3\21\0\20\3\1\133\10\3\22\0\1\134"+
    "\50\0\4\3\1\135\24\3\21\0\25\3\1\136\3\3"+
    "\21\0\16\3\1\137\12\3\21\0\3\3\1\140\25\3"+
    "\21\0\3\3\1\141\25\3\21\0\11\3\1\142\17\3"+
    "\21\0\12\3\1\143\16\3\21\0\11\3\1\144\17\3"+
    "\21\0\11\3\1\145\17\3\21\0\16\3\1\146\12\3"+
    "\21\0\16\3\1\147\12\3\21\0\17\3\1\120\11\3"+
    "\21\0\4\3\1\150\24\3\21\0\21\3\1\151\7\3"+
    "\21\0\11\3\1\152\17\3\21\0\11\3\1\153\17\3"+
    "\21\0\11\3\1\154\17\3\21\0\17\3\1\155\11\3"+
    "\21\0\2\3\1\156\26\3\21\0\13\3\1\151\15\3"+
    "\21\0\15\3\1\157\13\3\21\0\12\3\1\160\16\3"+
    "\21\0\16\3\1\161\12\3\21\0\3\3\1\162\25\3"+
    "\21\0\5\3\1\163\23\3\21\0\25\3\1\164\3\3"+
    "\21\0\4\3\1\165\24\3\22\0\1\134\41\0\1\166"+
    "\6\0\23\3\1\167\5\3\21\0\11\3\1\170\17\3"+
    "\21\0\12\3\1\171\16\3\21\0\15\3\1\172\13\3"+
    "\21\0\23\3\1\173\5\3\21\0\13\3\1\174\15\3"+
    "\21\0\16\3\1\175\12\3\21\0\22\3\1\176\6\3"+
    "\21\0\26\3\1\177\2\3\21\0\12\3\1\200\16\3"+
    "\21\0\4\3\1\201\24\3\21\0\11\3\1\202\17\3"+
    "\21\0\23\3\1\203\5\3\21\0\17\3\1\204\11\3"+
    "\21\0\11\3\1\205\17\3\21\0\10\3\1\206\20\3"+
    "\21\0\10\3\1\207\20\3\21\0\14\3\1\210\14\3"+
    "\21\0\13\3\1\211\15\3\21\0\2\3\1\212\26\3"+
    "\21\0\4\3\1\213\24\3\21\0\11\3\1\214\17\3"+
    "\21\0\20\3\1\215\10\3\21\0\13\3\1\216\15\3"+
    "\21\0\5\3\1\217\23\3\21\0\10\3\1\220\20\3"+
    "\21\0\23\3\1\221\5\3\21\0\13\3\1\222\15\3"+
    "\21\0\2\3\1\223\26\3\21\0\20\3\1\224\10\3"+
    "\21\0\16\3\1\225\12\3\21\0\4\3\1\226\24\3"+
    "\21\0\12\3\1\227\16\3\21\0\2\3\1\230\12\3"+
    "\1\231\13\3\21\0\2\3\1\232\26\3\21\0\21\3"+
    "\1\233\7\3\21\0\5\3\1\234\11\3\1\235\11\3"+
    "\21\0\5\3\1\236\23\3\21\0\26\3\1\237\2\3"+
    "\21\0\11\3\1\200\17\3\21\0\16\3\1\240\12\3"+
    "\21\0\5\3\1\241\23\3\21\0\6\3\1\242\22\3"+
    "\21\0\27\3\1\243\1\3\21\0\6\3\1\244\12\3"+
    "\1\245\7\3\21\0\20\3\1\246\10\3\21\0\3\3"+
    "\1\247\25\3\21\0\12\3\1\250\16\3\21\0\3\3"+
    "\1\251\25\3\21\0\4\3\1\252\24\3\21\0\14\3"+
    "\1\253\14\3\21\0\5\3\1\254\23\3\21\0\20\3"+
    "\1\255\10\3\21\0\16\3\1\256\12\3\21\0\20\3"+
    "\1\257\10\3\21\0\11\3\1\260\17\3\21\0\2\3"+
    "\1\261\26\3\21\0\12\3\1\262\16\3\21\0\12\3"+
    "\1\263\16\3\21\0\5\3\1\264\23\3\21\0\2\3"+
    "\1\151\26\3\21\0\2\3\1\265\26\3\21\0\20\3"+
    "\1\266\10\3\21\0\11\3\1\267\17\3\21\0\5\3"+
    "\1\270\23\3\21\0\11\3\1\271\17\3\21\0\13\3"+
    "\1\272\15\3\21\0\23\3\1\273\5\3\21\0\5\3"+
    "\1\274\23\3\21\0\12\3\1\275\16\3\21\0\12\3"+
    "\1\276\3\3\1\277\1\300\1\3\1\301\7\3\21\0"+
    "\20\3\1\302\10\3\21\0\12\3\1\303\16\3\21\0"+
    "\17\3\1\304\11\3\21\0\12\3\1\305\16\3\21\0"+
    "\12\3\1\306\16\3\21\0\24\3\1\106\4\3\21\0"+
    "\20\3\1\307\10\3\21\0\14\3\1\310\14\3\21\0"+
    "\2\3\1\311\26\3\21\0\12\3\1\312\16\3\21\0"+
    "\13\3\1\313\15\3\21\0\16\3\1\314\12\3\21\0"+
    "\11\3\1\315\17\3\21\0\12\3\1\316\16\3\21\0"+
    "\12\3\1\317\16\3\21\0\12\3\1\320\16\3\21\0"+
    "\16\3\1\321\12\3\21\0\20\3\1\322\10\3\21\0"+
    "\10\3\1\323\20\3\21\0\13\3\1\324\1\3\1\325"+
    "\13\3\21\0\12\3\1\326\16\3\21\0\20\3\1\327"+
    "\10\3\21\0\2\3\1\330\26\3\21\0\6\3\1\331"+
    "\22\3\21\0\12\3\1\310\16\3\21\0\17\3\1\332"+
    "\11\3\21\0\5\3\1\333\23\3\21\0\13\3\1\334"+
    "\15\3\21\0\11\3\1\335\17\3\21\0\24\3\1\336"+
    "\4\3\21\0\11\3\1\337\17\3\21\0\21\3\1\340"+
    "\7\3\21\0\13\3\1\341\15\3\21\0\4\3\1\342"+
    "\24\3\21\0\10\3\1\343\20\3\21\0\11\3\1\344"+
    "\17\3\21\0\11\3\1\342\17\3\21\0\12\3\1\345"+
    "\16\3\21\0\6\3\1\346\22\3\21\0\13\3\1\347"+
    "\15\3\21\0\26\3\1\350\2\3\21\0\15\3\1\351"+
    "\13\3\21\0\16\3\1\352\12\3\21\0\2\3\1\353"+
    "\26\3\21\0\20\3\1\354\10\3\21\0\3\3\1\355"+
    "\25\3\21\0\15\3\1\310\13\3\21\0\11\3\1\310"+
    "\17\3\21\0\22\3\1\57\6\3\21\0\11\3\1\356"+
    "\17\3\21\0\13\3\1\310\15\3\21\0\16\3\1\304"+
    "\12\3\21\0\13\3\1\357\15\3\21\0\24\3\1\310"+
    "\4\3\21\0\20\3\1\342\10\3\21\0\24\3\1\360"+
    "\4\3\21\0\5\3\1\361\23\3\21\0\25\3\1\362"+
    "\3\3\21\0\11\3\1\363\17\3\21\0\3\3\1\364"+
    "\25\3\21\0\11\3\1\365\17\3\21\0\12\3\1\334"+
    "\16\3\21\0\5\3\1\366\23\3\21\0\3\3\1\367"+
    "\25\3\21\0\23\3\1\370\5\3\21\0\22\3\1\371"+
    "\6\3\21\0\16\3\1\372\12\3\21\0\20\3\1\373"+
    "\10\3\21\0\20\3\1\374\10\3\21\0\20\3\1\375"+
    "\10\3\21\0\16\3\1\376\12\3\21\0\21\3\1\377"+
    "\7\3\21\0\17\3\1\u0100\11\3\21\0\12\3\1\u0101"+
    "\16\3\21\0\2\3\1\342\26\3\21\0\23\3\1\u0102"+
    "\5\3\21\0\20\3\1\u0103\10\3\21\0\14\3\1\u0104"+
    "\14\3\21\0\23\3\1\u0105\5\3\21\0\2\3\1\310"+
    "\26\3\21\0\3\3\1\u0106\25\3\21\0\24\3\1\u0107"+
    "\4\3\21\0\11\3\1\u0108\17\3\21\0\17\3\1\310"+
    "\11\3\21\0\20\3\1\u0109\10\3\21\0\20\3\1\u010a"+
    "\10\3\21\0\3\3\1\u010b\25\3\21\0\17\3\1\u010c"+
    "\11\3\21\0\11\3\1\u010d\17\3\21\0\2\3\1\u010e"+
    "\26\3\21\0\17\3\1\300\11\3\21\0\2\3\1\304"+
    "\26\3\21\0\13\3\1\u0107\15\3\21\0\13\3\1\273"+
    "\15\3\21\0\12\3\1\u010f\16\3\21\0\5\3\1\u0110"+
    "\23\3\21\0\13\3\1\274\15\3\21\0\24\3\1\u0100"+
    "\4\3\21\0\20\3\1\u0111\10\3\21\0\30\3\1\334"+
    "\21\0\6\3\1\u0112\22\3\21\0\25\3\1\u0113\3\3"+
    "\21\0\20\3\1\u0114\10\3\21\0\3\3\1\u0115\25\3"+
    "\21\0\2\3\1\u0116\26\3\21\0\24\3\1\u0117\4\3"+
    "\21\0\17\3\1\330\11\3\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10710];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\30\1\6\11\30\1\5\11\1\0\35\1"+
    "\1\0\31\1\1\11\241\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[279];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { return new Symbol (sym.OPERADOR_LOGICO, yychar, yyline, yytext());
          }
        case 30: break;
        case 14: 
          { return new Symbol (sym.ASPAS, yychar, yyline, yytext());
          }
        case 31: break;
        case 28: 
          { return new Symbol (sym.RESERVADO_FINALLY, yychar, yyline, yytext());
          }
        case 32: break;
        case 9: 
          { return new Symbol (sym.SEPARADOR_PARENTESE_FECHA, yychar, yyline, yytext());
          }
        case 33: break;
        case 25: 
          { return new Symbol (sym.OPERADOR_BOOLEANO, yychar, yyline, yytext());
          }
        case 34: break;
        case 3: 
          { return new Symbol (sym.NUMERO, yychar, yyline, new Integer(yytext()));
          }
        case 35: break;
        case 5: 
          { return new Symbol (sym.OPERADOR_ATRIBUICAO_IGUAL, yychar, yyline, yytext());
          }
        case 36: break;
        case 20: 
          { return new Symbol (sym.RESERVADO_FOR, yychar, yyline, yytext());
          }
        case 37: break;
        case 1: 
          { return new Symbol (sym.ERROR, yychar, yyline, yytext());
          }
        case 38: break;
        case 11: 
          { return new Symbol (sym.SEPARADOR_CHAVE_FECHA, yychar, yyline, yytext());
          }
        case 39: break;
        case 23: 
          { return new Symbol (sym.TIPO, yychar, yyline, yytext());
          }
        case 40: break;
        case 22: 
          { return new Symbol (sym.RESERVADO_NULL, yychar, yyline, yytext());
          }
        case 41: break;
        case 24: 
          { return new Symbol (sym.RESERVADO_ELSE, yychar, yyline, yytext());
          }
        case 42: break;
        case 4: 
          { return new Symbol (sym.OPERADOR_ARITMETICO, yychar, yyline, yytext());
          }
        case 43: break;
        case 21: 
          { return new Symbol (sym.RESERVADO_TRY, yychar, yyline, yytext());
          }
        case 44: break;
        case 6: 
          { return new Symbol (sym.OPERADOR_RELACIONAL, yychar, yyline, yytext());
          }
        case 45: break;
        case 19: 
          { return new Symbol (sym.TIPO_NUMERICO, yychar, yyline, yytext());
          }
        case 46: break;
        case 16: 
          { return new Symbol (sym.OPERADOR_AUTO_INCREMENTO, yychar, yyline, yytext());
          }
        case 47: break;
        case 10: 
          { return new Symbol (sym.SEPARADOR_CHAVE_ABRE, yychar, yyline, yytext());
          }
        case 48: break;
        case 29: 
          { return new Symbol (sym.EXCECAO, yychar, yyline, yytext());
          }
        case 49: break;
        case 15: 
          { return new Symbol (sym.RESERVADO_IF, yychar, yyline, yytext());
          }
        case 50: break;
        case 17: 
          { return new Symbol (sym.OPERADOR_ATRIBUICAO, yychar, yyline, yytext());
          }
        case 51: break;
        case 8: 
          { return new Symbol (sym.SEPARADOR_PARENTESE_ABRE, yychar, yyline, yytext());
          }
        case 52: break;
        case 26: 
          { return new Symbol (sym.RESERVADO_WHILE, yychar, yyline, yytext());
          }
        case 53: break;
        case 18: 
          { return new Symbol (sym.OPERADOR_RELACIONAL_IGUAL_DIFERENTE, yychar, yyline, yytext());
          }
        case 54: break;
        case 2: 
          { return new Symbol (sym.ID, yychar, yyline, yytext());
          }
        case 55: break;
        case 27: 
          { return new Symbol (sym.RESERVADO_CATCH, yychar, yyline, yytext());
          }
        case 56: break;
        case 13: 
          { 
          }
        case 57: break;
        case 12: 
          { return new Symbol (sym.SEPARADOR_PONTO_VIRGULA, yychar, yyline, yytext());
          }
        case 58: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return new Symbol(sym.EOF, new String("Fim do arquivo"));
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
