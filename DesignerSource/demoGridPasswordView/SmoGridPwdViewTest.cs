using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Smobiler.Core;
using Smobiler.Core.Controls;

namespace SmobilerApp4._0Test
{
    partial class SmoGridPwdViewTest : Smobiler.Core.Controls.MobileForm
    {
        private void button1_Press(object sender, EventArgs e)
        {
            MessageBox.Show(gridPasswordView1.Password);
        }
    }
}