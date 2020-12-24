package com.yangbingdong.principle.lsp.positive;

import com.yangbingdong.principle.lsp.Echo;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class PositiveEcho extends Echo {

    @Override
    public void echo(String s) {
        super.echo(s);
        metrics(s);
    }

    private void metrics(String s) {

    }

}
