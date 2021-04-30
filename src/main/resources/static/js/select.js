const main = {
    init: function () {
        const _this = this;
        $('#btn-check').on('click', function () {
            _this.check()
        })
    },
    check: function () {
        const radioList = document.getElementsByName('product')
        radioList.forEach((node) => {
            if(node.checked){
                opener.document.getElementById('product').innerText = node.value
            }
        })
        window.close()
    }
};
main.init()