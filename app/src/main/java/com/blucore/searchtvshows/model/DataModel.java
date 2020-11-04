package com.blucore.searchtvshows.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {

    /**
     * Search : [{"Title":"Batman Begins","Year":"2005","imdbID":"tt0372784","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BOTY4YjI2N2MtYmFlMC00ZjcyLTg3YjEtMDQyM2ZjYzQ5YWFkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"},{"Title":"Batman v Superman: Dawn of Justice","Year":"2016","imdbID":"tt2975590","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BYThjYzcyYzItNTVjNy00NDk0LTgwMWQtYjMwNmNlNWJhMzMyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"},{"Title":"Batman","Year":"1989","imdbID":"tt0096895","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BMTYwNjAyODIyMF5BMl5BanBnXkFtZTYwNDMwMDk2._V1_SX300.jpg"},{"Title":"Batman Returns","Year":"1992","imdbID":"tt0103776","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BOGZmYzVkMmItM2NiOS00MDI3LWI4ZWQtMTg0YWZkODRkMmViXkEyXkFqcGdeQXVyODY0NzcxNw@@._V1_SX300.jpg"},{"Title":"Batman Forever","Year":"1995","imdbID":"tt0112462","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BNDdjYmFiYWEtYzBhZS00YTZkLWFlODgtY2I5MDE0NzZmMDljXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg"},{"Title":"Batman & Robin","Year":"1997","imdbID":"tt0118688","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BMGQ5YTM1NmMtYmIxYy00N2VmLWJhZTYtN2EwYTY3MWFhOTczXkEyXkFqcGdeQXVyNTA2NTI0MTY@._V1_SX300.jpg"},{"Title":"The Lego Batman Movie","Year":"2017","imdbID":"tt4116284","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BMTcyNTEyOTY0M15BMl5BanBnXkFtZTgwOTAyNzU3MDI@._V1_SX300.jpg"},{"Title":"Batman: The Animated Series","Year":"1992\u20131995","imdbID":"tt0103359","Type":"series","Poster":"https://m.media-amazon.com/images/M/MV5BOTM3MTRkZjQtYjBkMy00YWE1LTkxOTQtNDQyNGY0YjYzNzAzXkEyXkFqcGdeQXVyOTgwMzk1MTA@._V1_SX300.jpg"},{"Title":"Batman: Under the Red Hood","Year":"2010","imdbID":"tt1569923","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BNmY4ZDZjY2UtOWFiYy00MjhjLThmMjctOTQ2NjYxZGRjYmNlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg"},{"Title":"Batman: The Dark Knight Returns, Part 1","Year":"2012","imdbID":"tt2313197","Type":"movie","Poster":"https://m.media-amazon.com/images/M/MV5BMzIxMDkxNDM2M15BMl5BanBnXkFtZTcwMDA5ODY1OQ@@._V1_SX300.jpg"}]
     * totalResults : 393
     * Response : True
     */

    @SerializedName("totalResults")
    private String totalResults;
    @SerializedName("Response")
    private String Response;
    @SerializedName("Search")
    private List<SearchBean> Search;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public List<SearchBean> getSearch() {
        return Search;
    }

    public void setSearch(List<SearchBean> Search) {
        this.Search = Search;
    }

    public static class SearchBean {
        /**
         * Title : Batman Begins
         * Year : 2005
         * imdbID : tt0372784
         * Type : movie
         * Poster : https://m.media-amazon.com/images/M/MV5BOTY4YjI2N2MtYmFlMC00ZjcyLTg3YjEtMDQyM2ZjYzQ5YWFkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg
         */

        @SerializedName("Title")
        private String Title;
        @SerializedName("Year")
        private String Year;
        @SerializedName("imdbID")
        private String imdbID;
        @SerializedName("Type")
        private String Type;
        @SerializedName("Poster")
        private String Poster;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String Year) {
            this.Year = Year;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public String getPoster() {
            return Poster;
        }

        public void setPoster(String Poster) {
            this.Poster = Poster;
        }
    }
}
