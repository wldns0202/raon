const main = {
    init: function () {
        const _this = this;
        $('#btn-send').on('click', function () {
            _this.send()
        })
    },
    send: function () {
        const data = {
            address: $('#address').val(),
            title: $('#title').val(),
            message: $('#message').val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/send',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('메일 전송 완료')
        }).fail(function (error) {
            alert(JSON.stringify(error))
        });
    }
};
main.init();