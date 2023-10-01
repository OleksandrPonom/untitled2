package mod7;

class GooSearchResult{
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String s = url.concat(".?");
        String domain = s.substring(s.indexOf("/")+2, s.indexOf("?")-1);

        return domain;
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        System.out.println(new GooSearchResult("https://rock.festival.com/?q=nearest").parseDomain());
    }
}
