using System;
using Smobiler.Core;
namespace SmobilerApp4._0Test
{
    partial class SmoGridPwdViewTest : Smobiler.Core.Controls.MobileForm
    {
        #region "SmobilerForm generated code "

        public SmoGridPwdViewTest()
            : base()
        {
            //This call is required by the SmobilerForm.
            InitializeComponent();

            //Add any initialization after the InitializeComponent() call
        }

        //SmobilerForm overrides dispose to clean up the component list.
        protected override void Dispose(bool disposing)
        {
            base.Dispose(disposing);
        }


        //NOTE: The following procedure is required by the SmobilerForm
        //It can be modified using the SmobilerForm.  
        //Do not modify it using the code editor.
        [System.Diagnostics.DebuggerStepThrough()]
        private void InitializeComponent()
        {
            this.button1 = new Smobiler.Core.Controls.Button();
            this.gridPasswordView1 = new M215_GridPasswordView.GridPasswordView();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(94, 198);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(100, 30);
            this.button1.Text = "button1";
            this.button1.Press += new System.EventHandler(this.button1_Press);
            // 
            // gridPasswordView1
            // 
            this.gridPasswordView1.Location = new System.Drawing.Point(10, 104);
            this.gridPasswordView1.Name = "gridPasswordView1";
            this.gridPasswordView1.Password = "";
            this.gridPasswordView1.PasswordType = M215_GridPasswordView.GridPasswordView.PwdType.numberPassword;
            this.gridPasswordView1.PasswordVisibility = false;
            this.gridPasswordView1.Size = new System.Drawing.Size(272, 78);
            // 
            // SmoGridPwdViewTest
            // 
            this.Controls.AddRange(new Smobiler.Core.Controls.MobileControl[] {
            this.button1,
            this.gridPasswordView1});
            this.Name = "SmoGridPwdViewTest";

        }
        #endregion

        private Smobiler.Core.Controls.Button button1;
        private M215_GridPasswordView.GridPasswordView gridPasswordView1;
    }
}