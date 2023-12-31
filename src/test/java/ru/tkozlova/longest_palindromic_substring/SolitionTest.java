package ru.tkozlova.longest_palindromic_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolitionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        Assertions.assertEquals("bb", solution.longestPalindrome("cbbd"));

        Assertions.assertEquals("aaaa", solution.longestPalindrome("aaaa"));

        Assertions.assertEquals("bab", solution.longestPalindrome("babad"));
        Assertions.assertEquals("a", solution.longestPalindrome("a"));

        Assertions.assertEquals(
                "tscvrnsnnwjzkynzxwcltutcvvhdivtmcvwdiwnbmdyfdvdiseyxyiiurpnhuuufarbwalzysetxbaziuuywugfzzmhoessycogxgujmgvnncwacziyybryxjagesgcmqdryfbofwxhikuauulaqyiztkpgmelnoudvlobdsgharsdkzzuxouezcycsafvpmrzanrixubvojyeuhbcpkuuhkxdvldhdtpkdhpiejshrqpgsoslbkfyraqbmrwiykggdlkgvbvrficmiignctsxeqslhzonlfekxexpvnblrfatvetwasewpglimeqemdgdgmemvdsrzpgacpnrbmomngjpiklqgbbalzxiikacwwzbzapqmatqmexxqhssggsyzpnvvpmzngtljlrhrjbnxgpcjuokgxcbzxqhmitcxlzfehwfiwcmwfliedljghrvrahlcoiescsbupitckjfkrfhhfvdlweeeverrwfkujjdwtcwbbbbwctwdjjukfwrreveeewldvfhhfrkfjkctipubscseioclharvrhgjldeilfwmcwifwhefzlxctimhqxzbcxgkoujcpgxnbjrhrljltgnzmpvvnpzysggsshqxxemqtamqpazbzwwcakiixzlabbgqlkipjgnmombrnpcagpzrsdvmemgdgdmeqemilgpwesawtevtafrlbnvpxexkeflnozhlsqexstcngiimcifrvbvgkldggkyiwrmbqaryfkblsosgpqrhsjeiphdkptdhdlvdxkhuukpcbhueyjovbuxirnazrmpvfascyczeuoxuzzkdsrahgsdbolvduonlemgpktziyqaluuaukihxwfobfyrdqmcgsegajxyrbyyizcawcnnvgmjugxgocysseohmzzfguwyuuizabxtesyzlawbrafuuuhnpruiiyxyesidvdfydmbnwidwvcmtvidhvvctutlcwxznykzjwnnsnrvcst",
                solution.longestPalindrome(
                        "tscvrnsnnwjzkynzxwcltutcvvhdivtmcvwdiwnbmdyfdvdiseyxyiiurpnhuuufarbwalzysetxbaziuuywugfzzmhoessycogxgujmgvnncwacziyybryxjagesgcmqdryfbofwxhikuauulaqyiztkpgmelnoudvlobdsgharsdkzzuxouezcycsafvpmrzanrixubvojyeuhbcpkuuhkxdvldhdtpkdhpiejshrqpgsoslbkfyraqbmrwiykggdlkgvbvrficmiignctsxeqslhzonlfekxexpvnblrfatvetwasewpglimeqemdgdgmemvdsrzpgacpnrbmomngjpiklqgbbalzxiikacwwzbzapqmatqmexxqhssggsyzpnvvpmzngtljlrhrjbnxgpcjuokgxcbzxqhmitcxlzfehwfiwcmwfliedljghrvrahlcoiescsbupitckjfkrfhhfvdlweeeverrwfkujjdwtcwbbbbwctwdjjukfwrreveeewldvfhhfrkfjkctipubscseioclharvrhgjldeilfwmcwifwhefzlxctimhqxzbcxgkoujcpgxnbjrhrljltgnzmpvvnpzysggsshqxxemqtamqpazbzwwcakiixzlabbgqlkipjgnmombrnpcagpzrsdvmemgdgdmeqemilgpwesawtevtafrlbnvpxexkeflnozhlsqexstcngiimcifrvbvgkldggkyiwrmbqaryfkblsosgpqrhsjeiphdkptdhdlvdxkhuukpcbhueyjovbuxirnazrmpvfascyczeuoxuzzkdsrahgsdbolvduonlemgpktziyqaluuaukihxwfobfyrdqmcgsegajxyrbyyizcawcnnvgmjugxgocysseohmzzfguwyuuizabxtesyzlawbrafuuuhnpruiiyxyesidvdfydmbnwidwvcmtvidhvvctutlcwxznykzjwnnsnrvcst"
                ));
    }
}
