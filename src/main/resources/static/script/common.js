function getSomeWeek(value) {
    if (value == 1) {
        return "First Week";
    }
    if (value == 2) {
        return "Second Week";
    }
    if (value == 3) {
        return "Third Week";
    }
    if (value == 4) {
        return "Fourth Week";
    }
}

function getDate(value) {
    var date = [];
    if (value == 1) {
        date = ["2018-12-06", "2018-12-07", "2018-12-08", "2018-12-09", "2018-12-10", "2018-12-11", "2018-12-12"];
    }
    if (value == 2) {
        date = ["2018-12-13", "2018-12-14", "2018-12-15", "2018-12-16", "2018-12-17", "2018-12-18", "2018-12-19"];
    }
    if (value == 3) {
        date = ["2018-12-20", "2018-12-21", "2018-12-22", "2018-12-23", "2018-12-24", "2018-12-25", "2018-12-26"];
    }
    if (value == 4) {
        date = ["2018-12-27", "2018-12-28", "2018-12-29", "2018-12-30", "2018-12-31", "2018-01-01", "2018-01-02"];
    }
    return date;
}