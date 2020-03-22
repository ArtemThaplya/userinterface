$('document').ready(function () {
    var result;

    $('#sum').on('click', function () {
        var firstNumber = $('#first').val();
        var secondNumber = $('#second').val();
        $.ajax({
            url: 'http://localhost:8080/sum',
            datatype: 'json',
            contentType: "application/json",
            data: {
                firstNumber: firstNumber,
                secondNumber: secondNumber
            },
            success: function (data) {
                result = data;
                if (result > 0) {
                    for (var i = 0; i < result; i++) {
                            setTimeout(round);
                            function round() {
                                var round_speed = 400;
                                $("#square").fadeOut(round_speed).fadeIn(round_speed).css('background', '#00FF00');
                            }
                    }
                } else {
                    alert('Error! The result is a negative number!')
                }
            }
        });
    });

    $('#subtraction').on('click', function () {
        var firstNumber = $('#first').val();
        var secondNumber = $('#second').val();
        $.ajax({
            url: 'http://localhost:8080/subtraction',
            datatype: 'json',
            contentType: "application/json",
            data: {
                firstNumber: firstNumber,
                secondNumber: secondNumber
            },
            success: function (data) {
                result = data;
                if (result > 0) {
                    for (var i = 0; i < result; i++) {
                        setTimeout(round);
                        function round() {
                            var round_speed = 400;
                            $("#square").fadeOut(round_speed).fadeIn(round_speed).css('background', '#FF0000');
                        }
                    }
                } else {
                    alert('Error! The result is a negative number!')
                }
            }
        });
    });
});
